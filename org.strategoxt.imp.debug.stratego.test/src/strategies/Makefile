include identity.dep

identity : identity.str
#	strj -i identity.str -o ../
	strj -i identity.str -o ../java/strategies/identity_lib/identity.java -p strategies.identity_lib

indentity-c: identity.str 	
	strc -i identity.str -o ../c/identity/indentity -la stratego-lib

wrap-block : wrap-block.str
#	strj -i wrap-block.str
	strj -i wrap-block.str -o ../java/strategies/wrap_block_lib/wrap_block.java -p strategies.wrap_block_lib

wrap-block-pp : wrap-block.str
#	strj -i wrap-block-pp.str
	strj -i wrap-block-pp.str -o ../java/strategies/wrap_block_pp_lib/wrap_block_pp.java -p strategies.wrap_block_pp_lib -la java-front

test-prop : test-prop.str
	strj -i test-prop.str -o ../java/strategies/test_prop_lib/test_prop.java -p strategies.test_prop_lib

# write stratego program to ast
parse-test-prop : test-prop.str	
	parse-stratego -i test-prop.str | pp-aterm -o terms/programs/test-prop.aterm
	
sample1-to-ast : sample1.str	
	parse-stratego -i sample1.str | pp-aterm -o terms/programs/sample1.aterm
	
test-parse-str-c : test-parse-str.str
	strc -i test-parse-str.str -o ../c/test-parse-str/test-parse-str -la stratego-lib -la strc -la stratego-xtc
