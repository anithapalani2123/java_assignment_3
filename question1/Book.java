package question1;

abstract class myBook{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
public class Book extends myBook{
    @Override
    void setTitle(String s) {
        this.title=s;
    }

}


