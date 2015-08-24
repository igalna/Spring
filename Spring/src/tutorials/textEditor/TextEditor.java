package tutorials.textEditor;

public class TextEditor {

	private SpellChecker spellChecker;
	
	public void setSpellChecker(SpellChecker sc) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker = sc;
	}
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	public void checkSpelling() {
		spellChecker.checkSpelling();
	}
}
