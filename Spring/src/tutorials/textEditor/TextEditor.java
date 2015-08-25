package tutorials.textEditor;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	private SpellChecker spellChecker;
	private String name;
	
	@Autowired
	public void setSpellChecker(SpellChecker sc) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker = sc;
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
