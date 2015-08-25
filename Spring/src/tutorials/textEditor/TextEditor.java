package tutorials.textEditor;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	@Autowired
	private SpellChecker spellChecker;
	private String name;
	
	public TextEditor() {
		System.out.println("Inside TextEditor constructor.");
	}
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void checkSpelling() {
		spellChecker.checkSpelling();
	}
}
