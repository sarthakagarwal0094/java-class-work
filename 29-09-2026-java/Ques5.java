class Ques5{
public static void main(String[] args){
int ar1[][]={
{1,2,3},
{4,5,6},
{7,8,9}
};

int ar2[][]={
{1,2,3},
{4,5,6},
{7,8,9}
};
int ar[][]=new int[ar1.length][ar1[0].length];

for(int i=0;i<ar1.length;i++){
for(int j=0;j<ar1[i].length;j++){
ar[i][j]+=ar1[i][j]+ar2[i][j];
}
}

for(int i=0;i<ar1.length;i++){
for(int j=0;j<ar1[i].length;j++){
System.out.print(ar[i][j]);
}
System.out.println();
}
}
}



