interface Camera {
    void takephoto();
}
interface Musicplayer {
    void playMusic();
}
class SmartPhone implements Camera,Musicplayer {
    public void takephoto() {
        System.out.println("Photo clicked");
    }
    public void playMusic() {
        System.out.println("Playing song");
    }

    }
    public class MultipleInheritance{
        public static void main (String[] args){
            SmartPhone sp = new SmartPhone();
            sp.takephoto();
            sp.playMusic();
        }
        }