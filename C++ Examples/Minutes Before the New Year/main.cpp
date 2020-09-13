#include <iostream>
#include<vector>
using namespace std;

int main()
{
    int t;
    int h=24,m=60;
    int n1=0,n2=0;
    int res=0;

    cin>>t;
    vector<int>v(t);
    while(t--)
    {
        int x,y;
        cin>>x>>y;
        if((h-x)==1)
        {
            v[t] = m -y;
            continue;
        }
        else if((h-x)!=1)
        {
            n1 = (h-x)*60;
            v[t]= n1 -y;
            continue;
        }
    }
    for(int i=v.size()-1;i>=0;i--)
        cout<<v[i]<<endl;
    return 0;
}
