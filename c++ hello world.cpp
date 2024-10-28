#include <bits/stdc++.h> 
using namespace std;
int dx[] = {-1, 1, 0, 0};
int dy[] = {0, 0, -1, 1};
int bfs(const vector<vector<int>>&maze,int m, int n, int x, int y ){
	queue<pair<pair<int,int>,int>> q;
	q.push({{x,y},0});	
	vector<vector<bool>> visited(n,vector<bool>(m,false));
	visited[x][y] = true ;
	while(!q.empty()){
        int r = q.front().first.first;
        int c = q.front().first.second;
        int steps = q.front().second;
        q.pop();
        if((r == 0 || c == 0 || r == m-1 || c == n-1) && maze[r][c] == 0)
        return steps +1;
	
	for(int i=0;i<4;i++){
	     int	newX = r + dx[i];
	int	newY = c + dy[i];
		if(newX >= 0 && newX < m && newY >=0 && newY < n && visited[newX][newY] == false && maze[newX][newY] == 0 ){
			visited[newX][newY] = true;
			q.push({{newX,newY},steps +1});
		}
	}
}
return -1;
}
int main() 
{ 
int m,n,r,c;
cin >>m>>n>>r>>c;
vector<vector<int>> v (m,vector<int>(n));
for(int i=0; i<m;i++){
	for(int j=0;j<n;j++){
		cin >> v[i][j];
	}
}
cout << bfs(v,m,n,r,c);
}
