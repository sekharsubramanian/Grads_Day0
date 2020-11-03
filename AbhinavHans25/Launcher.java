package com.Assessment;

import java.util.ArrayList;

public class Launcher {
	static NotesStore notesStore = new NotesStore();
	public static void main(String args[]) {
		Launcher launcher = new Launcher();
		String textNote1 = "Java is a set of computer software and specifications developed by James Gosling and Sun Microsystems";
		String textNote2 = "Few books to read- Ikigai, How to win friends and influence people";
		String textAndImageNote1 = "The shoping list on my fridge";
		String imgUrl1 = "//foo/bar1/bar2/imgset1.png";
		String textAndImageNote2 = "The size label of Jack's shirt";
		String imgUrl2 = "//foo/bar1/bar2/imgset2.png";
		
		notesStore.storeNote(textNote1);
		notesStore.storeNote(textNote2);
		
		notesStore.storeNote(textAndImageNote1,imgUrl1);
		notesStore.storeNote(textAndImageNote2, imgUrl2);
		
		launcher.displayTextNotes();
		System.out.println();
		launcher.displayAllTextAndNotes();
	}
	
	public void displayTextNotes() {
		ArrayList<TextNote> textNotesList = notesStore.getAllTextNotes();
		System.out.println("Text Note 1: " + (textNotesList.get(0)).getNote());
		System.out.println("Text Note 2: " + (textNotesList.get(1)).getNote());
	}
	
	public void displayAllTextAndNotes() {
		ArrayList<TextAndImageNote> textAndImageNotesList = notesStore.getAllTextAndImageNotes();
		System.out.println("Text Note 1: " + (textAndImageNotesList.get(0)).getNote() + ", " + (textAndImageNotesList.get(0)).getImgUrl());
		System.out.println("Text Note 2: " + (textAndImageNotesList.get(1)).getNote() + ", " + (textAndImageNotesList.get(1)).getImgUrl());
	}
}
