import java.util.*;

/**
 * Created by surabhi on 8/10/16.
 */
public class TextJusitfy
{
    public static List<String> fullJustify(String[] words, int maxWidth) {

        int count=0;
        int j=0;
        ArrayList<String>arr=new ArrayList<>();
        if(words[0].equals("")&&words.length==1)
        {
            insertspace("","",maxWidth);
            arr.add("");
            return arr;
        }
        StringBuilder inner=new StringBuilder();
        LinkedHashMap<String,Integer>hs=new LinkedHashMap<>();
        int i=0;
        int next=0;
        int rem=0;
        char c=words[i].charAt(j);

          while(c>='a'&&c<='z'||c==' '||c>='A'&&c<='Z'&&i<words.length-1)
            {
                next=i+1;
                if(next<words.length) {
                    rem = words[next].length() + count;
                    if (maxWidth - rem <= 1) {
                        inner.append(words[i] );
                        hs.put(inner.toString(),inner.length());
                        //arr.add(inner.toString()+inner.length());
                        count = 0;
                        inner = new StringBuilder();
                        i++;

                    } else {
                        inner.append(words[i] + " ");
                        count += words[i].length() + 1;
                        i++;
                    }
                }
                else {
                    inner.append(words[i]);
                    hs.put(inner.toString(),words[i].length());
                    //arr.add(inner.toString()+words[i].length());
                    break;
                }
            }
            //Iterator<Map.Entry<String,Integer>> itr=  hs.entrySet().iterator();
        Set<String>set=hs.keySet();
        int p=0;
            //please check
            while(p<hs.size()) {
                Iterator iter = set.iterator();
                while (iter.hasNext()) {
                    String s = iter.next().toString();
                    String[] split = s.split(" ");
                    int z = hs.get(s);
                    int miss = maxWidth - z;
                    int len = miss % 2;
                    int space = 0;
                    String str = "";
                    String res="";
                    int h = 0;
                    while(h < split.length- 1) {
                        int k=split.length;
                        if(k==1)
                        {
                            if(res.contains(split[h]))
                            {
                                return arr;
                            }
                        }
                        if (len == 0) {
                            space= miss /2;
                            if(res.contains(split[h]))
                            {
                                str = insertspace("", split[h + 1], space);
                                if(!res.contains(str))
                                    res+=str;
                            }
                            else
                            {
                                str=insertspace(split[h],split[h+1],space);
                                if(!res.contains(str))
                                    res+=str;
                            }
                        } else {
                            if(miss<2)
                            {
                                if(res.contains(split[h]))
                                {
                                    str = insertspace("", split[h + 1], space);
                                    if(!res.contains(str))
                                        res+=str;
                                }
                                else
                                {
                                    str=insertspace(split[h],split[h+1],space);
                                    if(!res.contains(str))
                                        res+=str;
                                }
                            }
                            else
                            {space = (miss - 1) / 2;
                            rem = miss - space;
                            str = insertspace(split[h], split[h + 1], space);
                                if(!res.contains(str))
                                    res+=str;

                            if (rem != 0) {
                                str = insertspace(split[h], split[h + 1], space);
                                if(!res.contains(str))
                                    res+=str;
                            }
                            }
                        }
                        h++;
                    }
                    if(h==split.length-1&&p==hs.size()-1)
                    {
                        if(!hs.containsValue(split[h]))
                        {
                            str = insertspace(split[h],"",space);
                            if(!res.contains(str))
                            res+=str;
                        }
                    }
                    arr.add(new String(res));
                    arr.add("\n");
                    System.out.println(arr.get(0).length());
                    p++;
                }
            }
        return arr;
    }
    public static String insertspace(String s,String t, int space)
    {
        int i=0;
        String str=s;
        while(i<=space)
        {
            str+=" ";
            i++;
        }
        str+=t;
        return str;
    }

    public static void main(String[] args) {
        String[] words={"this","is","fine"};
        System.out.println(Arrays.toString(fullJustify(words,2).toArray()));
    }
}
