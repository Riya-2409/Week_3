package day01linkedlist.doublylinkedlist.undoredofunctionality;

//Create the class name Text
public class Text {

    String content;
    Text next;
    Text prev;

    public Text(String content) {
        this.content = content;
        this.next = null;
        this.prev = null;
    }
}
