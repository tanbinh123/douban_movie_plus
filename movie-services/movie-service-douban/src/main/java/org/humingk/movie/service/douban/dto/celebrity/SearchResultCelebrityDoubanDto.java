package org.humingk.movie.service.douban.dto.celebrity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.humingk.movie.dal.domain.MovieDoubanOfCelebrityDoubanDo;
import org.humingk.movie.dal.entity.AliasCelebrityDouban;

import java.io.Serializable;
import java.util.List;

/**
 * 豆瓣影人搜索结果
 *
 * @author humingk
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchResultCelebrityDoubanDto implements Serializable {
  private static final long serialVersionUID = 1L;
  /** 豆瓣影人基础信息 */
  private CelebrityDoubanDto celebrityDoubanDto;
  /** 豆瓣影人别称列表 */
  private List<AliasCelebrityDouban> aliasCelebrityDoubanList;
  /** 与豆瓣影人相关的豆瓣电影列表 */
  private List<MovieDoubanOfCelebrityDoubanDo> movieDoubanOfCelebrityDoubanDoList;
}