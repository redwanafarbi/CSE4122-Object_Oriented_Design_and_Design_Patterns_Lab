public class audioPlayer implements mediaPlayer{
    mediaAdapter MediaAdapter;

    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file.Name: " + fileName);
        }else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            MediaAdapter = new mediaAdapter(audioType);
            MediaAdapter.play(audioType,fileName);
        }else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }


}
