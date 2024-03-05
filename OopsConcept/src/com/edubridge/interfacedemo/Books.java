package com.edubridge.interfacedemo;

//nested interface
//outer interface
public interface Books {
	
    void showBooks();
	
	//nested interface
	//inner interface
	interface StoryBooks{
		
		void showStoryBooks();
		
	}

}
