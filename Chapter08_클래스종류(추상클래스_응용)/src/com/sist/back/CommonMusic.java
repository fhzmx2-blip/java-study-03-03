package com.sist.back;

import com.sist.vo.*;

public abstract class CommonMusic {
    public static Music[] musics=new Music[50];

    public abstract void init();

    public Music[] musicAllData() 
    {
    	return musics;
    }

    
}