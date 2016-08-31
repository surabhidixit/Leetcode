import java.util.*;

/**
 * Created by surabhi on 8/3/16.
 */
public class GroupAnagram {
    //it is efficient to use hashmap because we can have fast access
    public static List<List<String>> groupAnagrams(String[] strs)
        {
            int flag=0;
            ArrayList<List<String>>output=new ArrayList<>();
            HashMap<String,List<String>>hs=new HashMap<>();
            ArrayList<String>inner=null;
            int i=0;

            for(String str:strs)
            {
                i=0;
                if(hs.size()==0)
                {
                    char[]key=str.toCharArray();
                    Arrays.sort(key);
                    inner=new ArrayList<String>();
                    inner.add(str);
                    String value=Arrays.toString(key);
                    hs.put(value,inner);
                }
                else {
                        char[]second=str.toCharArray();
                        Arrays.sort(second);
                        String value=Arrays.toString(second);
                        if(hs.containsKey(value))
                        {
                            List<String> list=hs.get(value);
                            list.add(str);

                        }
                        else
                        {
                            inner=new ArrayList<>();
                            inner.add(str);
                            hs.put(value,inner);

                        }


                        /*if(hs.get(i).get(0)=="")
                        {
                            i++;
                            flag=1;
                            break;
                        }
                        char[]list=output.get(i).get(0).toCharArray();

                        if(list.length!=second.length)
                        {
                            flag=1;

                        }
                        else
                        {
                            Arrays.sort(list);
                            Arrays.sort(second);
                            if(Arrays.equals(list,second))
                            {
                                output.get(i).add(str);
                                flag=0;
                                break;
                            }
                            else
                            {
                                i++;
                                flag=1;
                            }

                        }
                    }
                    if(flag==1)
                    {
                        inner=new ArrayList<>();
                        inner.add(str);
                        output.add(inner);
                        flag=0;

                    }*/
                }
                }
            output.addAll(hs.values());
            return output;

            }



    public static void main(String[] args) {
        String[]input={""};
        List<List<String>>x=groupAnagrams(input);
        System.out.println(Arrays.toString(x.toArray()));
    }

}
