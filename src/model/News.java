package model;

import java.util.Date;

public class News extends Document {
    private Date releaseDate;

    public News(String publisherName, int releaseNumber, Date releaseDate) {
        super(publisherName, releaseNumber);
        this.releaseDate = releaseDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return " Ngày xuất bản: " + releaseDate;
    }
}
