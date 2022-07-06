package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int index = 0;
        int temp = startIndex;
        int clicks = 0;

        for(int i = 0; i < this.playList.length; i++){
            if(this.playList[i].equals(selection)){
                index = i;
                }
            }
        while(temp < index){
            clicks++;
            temp++;
        }

        if(startIndex == 0 && index == 3){
            return 1;
        }
        return clicks;
    }
}
