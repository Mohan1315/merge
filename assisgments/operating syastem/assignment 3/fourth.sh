echo "Enter number"

read n
i=1
sum=0

echo "Enter num "
for((i=1; i<=n; i++))
do
	read num
	sum=$((sum+num))
done
sum=$((sum/n))
echo "The avg of given number is : $sum"
