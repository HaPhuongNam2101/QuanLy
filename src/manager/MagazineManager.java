package manager;

import model.Magazine;

import java.util.ArrayList;

public class MagazineManager implements IManager<Magazine> {
        ArrayList<Magazine> magazines;

    public MagazineManager() {
        this.magazines = new ArrayList<>();
    }

    @Override
    public void add(Magazine magazine) {
        magazines.add(magazine);
    }

    @Override
    public void remove(int id) {
        int index = magazines.indexOf(id);
    }

    @Override
    public void update(Magazine magazine, int id) {
        int index = findIndexById(id);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < magazines.size(); i++) {
            if (magazines.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public ArrayList<Magazine> getAll() {
        return magazines;
    }
    public Magazine findById(int id) {
        for (Magazine magazine : magazines) {
            if (magazine.getId() == id) {
                return magazine;
            }
        }
        return null;
    }
}
