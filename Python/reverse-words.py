def reverse_words(s):
    
    words = s.split()

    reverse_sentence = ' '.join(reversed(words)).strip()
 
    return reverse_sentence

string = "a good   example"
reversed_string = reverse_words(string)
print(reversed_string) 