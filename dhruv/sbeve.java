public class Sbeve {
    private String output;
    public void Joe(String input) {
        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i) == 'a'|| input.charAt(i) == 'e'|| input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                char[] out = input.toCharArray();
                out[i-1] = 'b';
                output = String.valueOf(out);
            }
        }
    }

    public String tostring() {
        return output;
    }
}