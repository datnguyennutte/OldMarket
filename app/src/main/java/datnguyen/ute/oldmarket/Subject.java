package datnguyen.ute.oldmarket;

public class Subject {
    private String nameSubject;
    private String mark;
    private int img;

    public Subject(String nameSubject, String mark, int img) {
        this.nameSubject = nameSubject;
        this.mark = mark;
        this.img = img;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

}
