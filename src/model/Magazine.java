package model;

public class Magazine extends Document {
    private int issueNumber;
    private int releaseMonth;

    public Magazine(String publisherName, int releaseNumber, int issueNumber, int releaseMonth) {
        super(publisherName, releaseNumber);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    @Override
    public String toString() {
        return " Số phát hành: " + issueNumber + " Tháng phát hành: " + releaseMonth ;
    }
}
