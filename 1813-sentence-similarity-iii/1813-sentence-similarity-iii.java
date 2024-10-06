class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
     if(sentence1.length()>sentence2.length())
     {
        String temp=sentence1;
        sentence1=sentence2;
        sentence2=temp;
     }
     String[] s1=sentence1.split(" ");
     String[] s2=sentence2.split(" ");
     int l1=0,r1=s1.length-1;
     int l2=0,r2=s2.length-1;
     while(l1<s1.length && l2<s2.length && s1[l1].equals(s2[l2]))
     {
        l1++;l2++;
     }
     while(r1>=0&&r2>=0&&s1[r1].equals(s2[r2]))
     {
            r1--;r2--;
     }
     return l1>r1;

    }
}