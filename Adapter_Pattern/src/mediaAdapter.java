public class mediaAdapter implements mediaPlayer{
    advancedMediaPlayer advancedMusicPlayer;

    public mediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("Vlc")){
            advancedMusicPlayer = new vlcPlayer();
        }else if(audioType.equalsIgnoreCase("Mp4")){
            advancedMusicPlayer = new mp4Player();
        }
    }

    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("Vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("Mp4")){
            advancedMusicPlayer.playmp4(fileName);
        }
    }
}
