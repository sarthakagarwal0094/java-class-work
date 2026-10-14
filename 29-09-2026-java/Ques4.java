class Ques4{
public static void main(String[] args){
int arr[][]={
{40,50,60,70},
{100,200,300,400},
{1,2,3,4},
{9,8,7,6}};
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr[i].length;j++){
if(i==j){
System.out.println(arr[i][j]);
}
}
}

}
}