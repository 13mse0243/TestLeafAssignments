package week3.assignment.StringArray;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";
		String[] words = text.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                	result.append(" ");
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result.append(words[i]).append(" ");
            }
        }

        // Remove the trailing space
        System.out.println(result.toString());

	}

}
