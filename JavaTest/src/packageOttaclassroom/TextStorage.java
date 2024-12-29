package packageOttaclassroom;

public class TextStorage {
    // 宣告字串變數 input，這是一個實體變數，也是TextStorage這個類別的屬性。
    String input;

    // 建構子，初始化 input，this.input是TextStorage這個類別的input屬性，我們現在要把這個屬性改成由參數input帶進來的值。
    public TextStorage(String input) {
    	this.input = input;
    }

    // Getter 方法，取得 input 的值
    public String getInput() {
        return input;
    }

    // Setter 方法，設定 input 的值
    public void setInput(String input) {
    	this.input = input;
    }

    // 顯示 input 的內容
    public void displayInput() {
        System.out.println(input);
    }

    // 主方法測試
    public static void main(String[] args) {
        // 建立 TextStorage 物件
        TextStorage textstorage = new TextStorage("你好");

        // 顯示初始值
        textstorage.displayInput();

        // 修改 input 的值
        textstorage.setInput("再見");

        // 顯示修改後的值
        textstorage.displayInput();
        
    }
}
