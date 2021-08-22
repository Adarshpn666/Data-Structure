public class StringCountSort {


    public static void main(String[] args) {
        String s  = "iduixjtqnkh";
        System.out.println(countSort(s));
    }

    public static String countSort(String arr)
    {
        // code here
        int[] count  = new int[26];
        for(int i = 0;i<arr.length();i++) {
            int index = arr.charAt(i)-97;
            count[index]++;
        }
        for(int i = 1;i<26;i++){
            count[i] +=count[i-1]; 
        }
        
        char[] output = new char[arr.length()];
        for(int i = arr.length()-1;i>=0;i--){
            output[count[(arr.charAt(i)-97)]-1] = arr.charAt(i);

            count[(arr.charAt(i)-97)]--;
        }
        
        return new String(output);
    }
    
}
