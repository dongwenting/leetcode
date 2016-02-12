package leetcode.algorithms.string;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] version1s = version1.split("\\.");
        String[] version2s = version2.split("\\.");
        int i=0, j=0;
        while(i<version1s.length&&j<version2s.length){
        	Integer v1 = Integer.parseInt(version1s[i++]);
        	Integer v2 = Integer.parseInt(version2s[j++]);
        	if(v1<v2){
        		return -1;
        	}else if(v1>v2){
        		return 1;
        	}
        }
        while(i<version1s.length){
        	Integer v1 = Integer.parseInt(version1s[i]);
        	if(v1 == 0){
        		i++;
        	}else{
        		break;
        	}
        }
        while(j<version2s.length){
        	Integer v2 = Integer.parseInt(version2s[j]);
        	if(v2 == 0){
        		j++;
        	}else{
        		break;
        	}
        }
        if(i==version1s.length && j==version2s.length){
        	return 0;
        }
        if(i== version1s.length){
        	return -1;
        }
        if(j == version2s.length){
        	return 1;
        }
        return 0;
    }
}
