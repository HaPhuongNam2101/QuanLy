package manager;

import model.News;

import java.util.ArrayList;

public class NewsManager implements IManager<News> {
    ArrayList<News> newsList;

    public NewsManager() {
        this.newsList = new ArrayList<>();
    }

    @Override
    public void add(News news) {
        newsList.add(news);
    }

    @Override
    public void remove(int id) {
        int index = newsList.indexOf(id);
    }

    @Override
    public void update(News news, int id) {
        int index = findIndexById(id);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i <newsList.size(); i++) {
            if (newsList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<News> getAll() {
        return newsList;
    }
    public News findById(int id) {
        for (News news : newsList) {
            if (news.getId() == id) {
                return news;
            }
        }
        return null;
    }
}
