package model;

public class Document {
    private int id;
    private String publisherName;
    private int releaseNumber;

    private static int idIncrement = 1;
    public Document(String publisherName,  int releaseNumber) {
        this.id = idIncrement;
        this.publisherName = publisherName;
        this.releaseNumber = releaseNumber;
        idIncrement++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString() {
        return "Mã tài liệu: " + id + " Tên nhà sản xuất: " + publisherName + " Số bản phát hành: " + releaseNumber;
    }
}
