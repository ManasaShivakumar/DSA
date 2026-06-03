public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        Rook  r = new Rook();
        King k = new King();
        q.moves();
        r.moves();
        k.moves();
        // video v1 = new video();
        // v1.picture();
        // v1.music();    
        // v1.video();   
    }
} 
interface chessplayer{
    void moves();
}
class Queen implements chessplayer {
    public void moves() {
        System.out.println("Move in any directions");
    }
}
class Rook implements chessplayer {
    public void moves() {
        System.out.println("Moves stright in left, right, up and down");
    }
}
class King implements chessplayer {
    public void moves() {
        System.out.println("Moves in all direction but only by 1 step");
    }
}
interface Takephoto {
    void picture();
}
interface Song {
    void music();
}
class video implements Takephoto, Song {
    public void picture() {
        System.out.println("Taking pictures.....");
    } 
    public void music() {
        System.out.println("Selecting best music which is suitable for pictures");
    }
    public void video() {
        System.out.println("Video is ready");
    }
}
