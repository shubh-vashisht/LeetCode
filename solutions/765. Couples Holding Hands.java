                            row=swap(i+1,j,row);
                            swaps++;
                            break;
                        }
                        it++;
                        j=(j+1)%row.length;
                    }
                }
            }
        }else{
                  for(int i=0;i<row.length-1;i+=2){
                int aim = 0;
           if(row[i]%2==0){
               aim=-1;
           }else{
               aim=1;
           }
              int m = row[i+1]-row[i];
                it=0;
                if(m!=aim){
                    int j = i;
                    while(it<row.length){
                        m = row[j]-row[i];
                        if(m==aim){
                            row=swap(i+1,j,row);
                            swaps++;
                            break;
                        }
                        it++;
                        j=(j+1)%row.length;
                    }
                }
            }
        }
        return swaps;
    }
    public int[] swap(int i,int j, int row[]){
        int temp = row[i];
        row[i]=row[j];
        row[j]=temp;
 return row;
    }
}
