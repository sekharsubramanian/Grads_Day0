package com.Assessment;

import java.util.ArrayList;
import java.util.HashMap;

public class NotesStore {
	private ArrayList<TextNote> textNoteStore = new ArrayList<TextNote>();
	private ArrayList<TextAndImageNote> textAndImageNoteStore = new ArrayList<TextAndImageNote>();
	
	public void storeNote(String text) {
		textNoteStore.add(new TextNote(text));
	}
	
	public void storeNote(String text, String imgUrl) {
		textAndImageNoteStore.add(new TextAndImageNote(text, imgUrl));
	}
	
	public ArrayList<TextNote> getAllTextNotes() {
		return textNoteStore;
	}
	
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		return textAndImageNoteStore;
	}
}
