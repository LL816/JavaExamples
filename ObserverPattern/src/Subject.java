/**
 * Created by Cheryl on 2016/7/20.
 */
public interface Subject {
    void addObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObserver();
}
