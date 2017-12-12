package com.mc.Adapter;

/**
 * @author ChenglongChu
 * @description 结构类设计模式 - 适配器模式(Adapter Pattern)
 * step7: 案例演示
 * @create 2017/11/28 17:02
 * @since v0.1
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "file1map3");
        audioPlayer.play("mp4", "file2map4");
        audioPlayer.play("vlc", "file3vlc");
        audioPlayer.play("avi", "file4avi");

    }
}
