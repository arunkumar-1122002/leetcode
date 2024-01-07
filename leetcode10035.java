class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions)
    {
        int maxIndex=0;
        double maxDiagonal=diagonal(dimensions[0][0],dimensions[0][1]);
        for(int i=1;i<dimensions.length;i++)
        {
            double currentDiagonal=diagonal(dimensions[i][0],dimensions[i][1]);
            if(currentDiagonal>maxDiagonal)
            {
                maxDiagonal=currentDiagonal;
                maxIndex=i;
            }
            else if(currentDiagonal==maxDiagonal)
            {
                if(dimensions[i][0]*dimensions[i][1]>dimensions[maxIndex][0]*dimensions[maxIndex][1])
                {
                    maxDiagonal=currentDiagonal;
                    maxIndex=i;
                }
            }
        }
        return dimensions[maxIndex][0]*dimensions[maxIndex][1];
    }
    private double diagonal(int length,int width)
    {
        return Math.sqrt((length*length)+(width*width));
    }
}
