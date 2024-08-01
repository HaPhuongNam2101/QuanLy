package manager;

import model.Book;
import model.Document;
import model.Magazine;
import model.News;

import java.util.ArrayList;

public class DocumentManager implements IManager<Document> {
    ArrayList<Document> documents;

    public DocumentManager() {
        this.documents = new ArrayList<>();
    }

    @Override
    public void add(Document document) {
        documents.add(document);
    }

    @Override
    public void remove(int id) {
        int index = findIndexById(id);
        documents.remove(index);
    }

    @Override
    public void update(Document document, int id) {
        int index = findIndexById(id);
        documents.set(index, document);
    }

    @Override
    public int findIndexById(int id) {
       for (int i = 0; i < documents.size(); i++) {
           if (documents.get(i).getId() == id) {
               return i;
           }
       }
       return -1;
    }

    @Override
    public ArrayList<Document> getAll() {
        return documents;
    }
}

