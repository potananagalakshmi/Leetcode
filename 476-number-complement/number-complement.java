class Solution {
    public int findComplement(int num) {
        String a=Integer.toBinaryString(num);
        String b="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='0')
            {
                b=b+"1";
            }
            else
            {
                b=b+"0";
            }
        }
        return Integer.parseInt(b,2);
        
    }
}