read N

i=1
sum=0
for((i=1;i<=N;i++))
do
 read num
 sum=$((sum + num))
done

avg=$((sum/N))
echo $avg
