import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

// class to limit the characters for a text field
public class CharacterLImit extends PlainDocument {
    private final int limit;

    //constructor
    CharacterLImit(int limit){
        this.limit = limit;
    }
    public void insertString(int offset, String str, AttributeSet set) throws BadLocationException{
        if(str == null){
            return;
        } else if ((getLength() + str.length()) <= limit){
            super.insertString(offset,str,set);
        }
    }
}
