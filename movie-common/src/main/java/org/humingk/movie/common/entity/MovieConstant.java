package org.humingk.movie.common.entity;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ListMultimap;

/**
 * 电影相关常量类
 *
 * @author humingk
 */
public class MovieConstant {
  /** 影片类型 */
  public static final ListMultimap<Byte, String> VIDEO_TYPE = ArrayListMultimap.create();

  static {
    VIDEO_TYPE.put((byte) 1, "未知");
    VIDEO_TYPE.put((byte) 1, "unknown");
    VIDEO_TYPE.put((byte) 2, "电影");
    VIDEO_TYPE.put((byte) 2, "movie");
    VIDEO_TYPE.put((byte) 3, "电视剧");
    VIDEO_TYPE.put((byte) 3, "tv series");
    VIDEO_TYPE.put((byte) 4, "短片");
    VIDEO_TYPE.put((byte) 4, "short");
    VIDEO_TYPE.put((byte) 5, "迷你电视剧");
    VIDEO_TYPE.put((byte) 5, "tv mini series");
    VIDEO_TYPE.put((byte) 6, "电视短片");
    VIDEO_TYPE.put((byte) 6, "tv short");
    VIDEO_TYPE.put((byte) 7, "电视特辑");
    VIDEO_TYPE.put((byte) 7, "tv special");
    VIDEO_TYPE.put((byte) 8, "电视电影");
    VIDEO_TYPE.put((byte) 8, "tvMovie");
    VIDEO_TYPE.put((byte) 9, "视频");
    VIDEO_TYPE.put((byte) 9, "video");
    VIDEO_TYPE.put((byte) 10, "视频游戏");
    VIDEO_TYPE.put((byte) 10, "video game");
  }

  /** 影人职业类型 */
  public static final ListMultimap<Byte, String> PROFESSION_TYPE = ArrayListMultimap.create();

  static {
    PROFESSION_TYPE.put((byte) 1, "未知");
    PROFESSION_TYPE.put((byte) 1, "unknown");
    PROFESSION_TYPE.put((byte) 2, "导演");
    PROFESSION_TYPE.put((byte) 2, "director");
    PROFESSION_TYPE.put((byte) 3, "编剧");
    PROFESSION_TYPE.put((byte) 3, "writer");
    PROFESSION_TYPE.put((byte) 4, "演员");
    PROFESSION_TYPE.put((byte) 4, "starring");
    PROFESSION_TYPE.put((byte) 5, "男演员");
    PROFESSION_TYPE.put((byte) 5, "actor");
    PROFESSION_TYPE.put((byte) 6, "女演员");
    PROFESSION_TYPE.put((byte) 6, "actress");
    PROFESSION_TYPE.put((byte) 7, "存档胶片");
    PROFESSION_TYPE.put((byte) 7, "archive_footage");
    PROFESSION_TYPE.put((byte) 8, "存档声音");
    PROFESSION_TYPE.put((byte) 8, "archive_sound");
    PROFESSION_TYPE.put((byte) 9, "摄影师");
    PROFESSION_TYPE.put((byte) 9, "cinematographer");
    PROFESSION_TYPE.put((byte) 10, "作曲家");
    PROFESSION_TYPE.put((byte) 10, "composer");
    PROFESSION_TYPE.put((byte) 11, "编辑");
    PROFESSION_TYPE.put((byte) 11, "editor");
    PROFESSION_TYPE.put((byte) 12, "制片人");
    PROFESSION_TYPE.put((byte) 12, "producer");
    PROFESSION_TYPE.put((byte) 13, "美工");
    PROFESSION_TYPE.put((byte) 13, "production_designer");
    PROFESSION_TYPE.put((byte) 14, "自己?");
    PROFESSION_TYPE.put((byte) 14, "self");
  }

  //  public static final ImmutableMap<Byte, String> PROFESSION_TYPE =
  //          ImmutableMap.<Byte,String>builder()
  //          .put((byte)1, "未知"),

  //
  /** 电影类型 */
  public static final ImmutableMap<Short, String> MOVIE_TYPE =
      ImmutableMap.<Short, String>builder()
          .put((short) 1, "未知")
          .put((short) 2, "剧情")
          .put((short) 3, "喜剧")
          .put((short) 4, "爱情")
          .put((short) 5, "动作")
          .put((short) 6, "惊悚")
          .put((short) 7, "动画")
          .put((short) 8, "犯罪")
          .put((short) 9, "纪录片")
          .put((short) 10, "短片")
          .put((short) 11, "恐怖")
          .put((short) 12, "悬疑")
          .put((short) 13, "科幻")
          .put((short) 14, "冒险")
          .put((short) 15, "奇幻")
          .put((short) 16, "家庭")
          .put((short) 17, "战争")
          .put((short) 18, "历史")
          .put((short) 19, "传记")
          .put((short) 20, "音乐")
          .put((short) 21, "同性")
          .put((short) 22, "古装")
          .put((short) 23, "歌舞")
          .put((short) 24, "运动")
          .put((short) 25, "情色")
          .put((short) 26, "儿童")
          .put((short) 27, "武侠")
          .put((short) 28, "西部")
          .put((short) 29, "真人秀")
          .put((short) 30, "黑色电影")
          .put((short) 31, "灾难")
          .put((short) 32, "脱口秀")
          .put((short) 33, "舞台艺术")
          .put((short) 34, "戏曲")
          .put((short) 35, "鬼怪")
          .build();
}