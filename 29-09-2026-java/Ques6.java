class Ques6{
public static void main(String[] args){
int ar[][]={{1,2,3,4},{5,6,7,8}};
int a[][]=new int[ar[0].length][ar.length];

for(int i=0;i<ar.length;i++){
for(int j=0;j<ar[i].length;j++){
a[i][j]=ar[i][j];
}
}

for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
System.out.print(a[i][j]);
}
System.out.println();
}

}
}


