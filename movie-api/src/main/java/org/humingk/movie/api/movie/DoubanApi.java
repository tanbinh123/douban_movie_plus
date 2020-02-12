package org.humingk.movie.api.movie;

import org.humingk.movie.api.common.vo.MovieDoubanDetailsVo;
import org.humingk.movie.api.common.vo.MovieDoubanVo;
import org.humingk.movie.common.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

// 用于生成API文档
//import org.springframework.web.bind.annotation.RestController;
//@RestController

/**
 * 豆瓣电影API
 *
 * @author humingk
 */
@Validated
@FeignClient(value = "movie-server-movie")
public interface DoubanApi {

    /**
     * 豆瓣电影基础信息
     *
     * @param id 电影豆瓣ID
     * @return
     * @apiNote 包括电影海报, 电影年份，电影简介等基础信息
     */
    @RequestMapping(value = "/movie/douban/bases", method = RequestMethod.GET)
    Result<MovieDoubanVo> bases(@RequestParam("id") @NotNull Long id);

    /**
     * 豆瓣电影详情信息
     *
     * @param id 电影豆瓣ID
     * @return
     * @apiNote 包括电影海报、基础信息、剧情简介
     */
    @RequestMapping(value = "/movie/douban/details", method = RequestMethod.GET)
    Result<MovieDoubanDetailsVo> details(@RequestParam("id") @NotNull Long id);

    /**
     * 豆瓣电影图片
     *
     * @param id 电影豆瓣ID
     * @return
     */
    @RequestMapping(value = "/movie/douban/images", method = RequestMethod.GET)
    Result images(@RequestParam("id") @NotNull Long id);

    /**
     * 豆瓣电影热门短评
     *
     * @param id     电影豆瓣ID
     * @param offset 偏移量（默认0）
     * @param limit  限制数（默认10）
     * @return
     */
    @RequestMapping(value = "/movie/douban/hot_comments", method = RequestMethod.GET)
    Result hotComments(@RequestParam("id") @NotNull Long id,
                       @RequestParam(value = "offset",
                               required = false,
                               defaultValue = "0") @PositiveOrZero Integer offset,
                       @RequestParam(value = "limit",
                               required = false,
                               defaultValue = "10") @PositiveOrZero Integer limit);

    /**
     * 豆瓣电影热门影评
     *
     * @param id     电影豆瓣ID
     * @param offset 偏移量（默认0）
     * @param limit  限制数（默认10）
     * @return
     */
    @RequestMapping(value = "/movie/douban/hot_reviews", method = RequestMethod.GET)
    Result hotReviews(@RequestParam("id") Long id,
                      @RequestParam(value = "offset",
                              required = false,
                              defaultValue = "0") @PositiveOrZero Integer offset,
                      @RequestParam(value = "limit",
                              required = false,
                              defaultValue = "10") @PositiveOrZero Integer limit);

    /**
     * 豆瓣电影搜索提示
     *
     * @param keyword 搜索关键字
     * @param offset  偏移量（默认0）
     * @param limit   限制数（默认10）
     * @return
     * @apiNote 根据电影名称开头的字符串找出豆瓣电影的基本信息列表
     */
    @RequestMapping(value = "/movie/douban/search_tips", method = RequestMethod.GET)
    Result searchTips(@RequestParam("keyword") @NotBlank String keyword,
                      @RequestParam(value = "offset",
                              required = false,
                              defaultValue = "0") @PositiveOrZero Integer offset,
                      @RequestParam(value = "limit",
                              required = false,
                              defaultValue = "10") @PositiveOrZero Integer limit);

    /**
     * 豆瓣电影搜索结果
     *
     * @param keyword 搜索关键字
     * @param offset  偏移量（默认0）
     * @param limit   限制数（默认10）
     * @return
     * @apiNote 根据电影名称字符串找出豆瓣电影的基本信息列表
     */
    @RequestMapping(value = "/movie/douban/search_details", method = RequestMethod.GET)
    Result searchDetails(@RequestParam("keyword") @NotBlank String keyword,
                         @RequestParam(value = "offset",
                                 required = false,
                                 defaultValue = "0") @PositiveOrZero Integer offset,
                         @RequestParam(value = "limit",
                                 required = false,
                                 defaultValue = "10") @PositiveOrZero Integer limit);

}