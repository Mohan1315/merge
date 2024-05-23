echo "Test Score"
read score

 case $score in
     100) echo "A" ;;
     9[0-9]) echo "A" ;;
     8[0-9]) echo "B" ;;
     7[0-9]) echo "C" ;;
     6[0-9]) echo "D" ;;
      *) echo "F" ;;
esac
