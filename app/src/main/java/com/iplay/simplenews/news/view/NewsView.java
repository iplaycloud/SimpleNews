package com.iplay.simplenews.news.view;

import com.iplay.simplenews.beans.NewsBean;

import java.util.List;

/**
 * Description :
 * Author : lauren
 * Email  : iplaycloud@gmail.com
 * Blog   : www.iplaycloud.xyz
 * Date   : 15/12/18
 */
public interface NewsView {

    void showProgress();

    void addNews(List<NewsBean> newsList);

    void hideProgress();

    void showLoadFailMsg();
}
