useFixture(default)

def test():
	from Modules import commonBits
	java_recorded_version = '1.6.0_17'

	if window('Protocol Buffer Editor'):
		select('FileChooser', commonBits.sampleDir() +  'protoSales11.bin')
		select('ComboBox1', 'Compiled Proto')
		select('FileChooser1', commonBits.stdCopybookDir() + 'Sales11.protocomp')
		select('ComboBox1', 'Compiled Proto')
		click('Edit1')
		select('Table', 'rows:[1,2,3,4,5,6,7,8],columns:[4|saleDate,5|quantity]')
		select_menu('View>>Table View #{Selected Records#}')
##		select('Table2', 'rows:[2,3,4,5,6,7,8],columns:[4|saleDate,5|quantity]')
		assert_p('Table', 'Content', '[[69684558, 20, 280, 40118, 1, 5010, 5.01, 5.01, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [69694158, 20, 280, 40118, 1, 19000, 19.0, 19.0, SALE, DEBIT_CARD, [\'\',\' 0\',\' 0 1\',\' 0 1 2\']], [69694158, 20, 280, 40118, -1, -19000, -19.0, , RETURN, , [\'\',\' 0\',\' 0 1\',\' 0 1 2\',\' 0 1 2 3\',\' 0 1 2 3 4\']], [69694158, 20, 280, 40118, 1, 5010, , 5.01, SALE, CASH, []], [63604808, 20, 170, 40118, 1, 4870, 4.87, 4.87, SALE, CHEQUE, [\'\']], [62684671, 20, 685, 40118, 1, 69990, 69.99, 69.99, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [62684671, 20, 685, 40118, -1, -69990, -69.99, -69.99, RETURN, DEBIT_CARD, [\'\',\' 0\',\' 0 1\',\' 0 1 2\']]]')
		select('Table', 'RETURN', '9|saleType,1')
		select('Table', 'cell:7|priceFloat,2(-19.0)')
		assert_p('Table', 'Content', '[[69684558, 20, 280, 40118, 1, 5010, 5.01, 5.01, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [69694158, 20, 280, 40118, 1, 19000, 19.0, 19.0, RETURN, DEBIT_CARD, [\'\',\' 0\',\' 0 1\',\' 0 1 2\']], [69694158, 20, 280, 40118, -1, -19000, -19.0, , RETURN, , [\'\',\' 0\',\' 0 1\',\' 0 1 2\',\' 0 1 2 3\',\' 0 1 2 3 4\']], [69694158, 20, 280, 40118, 1, 5010, , 5.01, SALE, CASH, []], [63604808, 20, 170, 40118, 1, 4870, 4.87, 4.87, SALE, CHEQUE, [\'\']], [62684671, 20, 685, 40118, 1, 69990, 69.99, 69.99, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [62684671, 20, 685, 40118, -1, -69990, -69.99, -69.99, RETURN, DEBIT_CARD, [\'\',\' 0\',\' 0 1\',\' 0 1 2\']]]')
		select('Table', '', '10|paymentType,1')
		select('Table', 'cell:7|priceFloat,2(-19.0)')
		assert_p('Table', 'Content', '[[69684558, 20, 280, 40118, 1, 5010, 5.01, 5.01, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [69694158, 20, 280, 40118, 1, 19000, 19.0, 19.0, RETURN, , [\'\',\' 0\',\' 0 1\',\' 0 1 2\']], [69694158, 20, 280, 40118, -1, -19000, -19.0, , RETURN, , [\'\',\' 0\',\' 0 1\',\' 0 1 2\',\' 0 1 2 3\',\' 0 1 2 3 4\']], [69694158, 20, 280, 40118, 1, 5010, , 5.01, SALE, CASH, []], [63604808, 20, 170, 40118, 1, 4870, 4.87, 4.87, SALE, CHEQUE, [\'\']], [62684671, 20, 685, 40118, 1, 69990, 69.99, 69.99, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [62684671, 20, 685, 40118, -1, -69990, -69.99, -69.99, RETURN, DEBIT_CARD, [\'\',\' 0\',\' 0 1\',\' 0 1 2\']]]')
		select('Table', 'CREDIT_CARD', '10|paymentType,2')
		select('Table', 'cell:8|priceDouble,3(5.01)')
		assert_p('Table', 'Content', '[[69684558, 20, 280, 40118, 1, 5010, 5.01, 5.01, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [69694158, 20, 280, 40118, 1, 19000, 19.0, 19.0, RETURN, , [\'\',\' 0\',\' 0 1\',\' 0 1 2\']], [69694158, 20, 280, 40118, -1, -19000, -19.0, , RETURN, CREDIT_CARD, [\'\',\' 0\',\' 0 1\',\' 0 1 2\',\' 0 1 2 3\',\' 0 1 2 3 4\']], [69694158, 20, 280, 40118, 1, 5010, , 5.01, SALE, CASH, []], [63604808, 20, 170, 40118, 1, 4870, 4.87, 4.87, SALE, CHEQUE, [\'\']], [62684671, 20, 685, 40118, 1, 69990, 69.99, 69.99, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [62684671, 20, 685, 40118, -1, -69990, -69.99, -69.99, RETURN, DEBIT_CARD, [\'\',\' 0\',\' 0 1\',\' 0 1 2\']]]')
		select('Table', 'DEBIT_CARD', '10|paymentType,3')
		select('Table', 'cell:8|priceDouble,3(5.01)')
##		assert_p('Table', 'Content', '[[69684558, 20, 280, 40118, 1, 5010, 5.01, 5.01, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [69694158, 20, 280, 40118, 1, 19000, 19.0, 19.0, RETURN, , [\'\',\' 0\',\' 0 1\',\' 0 1 2\']], [69694158, 20, 280, 40118, -1, -19000, -19.0, , RETURN, CREDIT_CARD, [\'\',\' 0\',\' 0 1\',\' 0 1 2\',\' 0 1 2 3\',\' 0 1 2 3 4\']], [69694158, 20, 280, 40118, 1, 5010, , 5.01, SALE, DEBIT_CARD, [\'\']], [63604808, 20, 170, 40118, 1, 4870, 4.87, 4.87, SALE, CHEQUE, [\'\']], [62684671, 20, 685, 40118, 1, 69990, 69.99, 69.99, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [62684671, 20, 685, 40118, -1, -69990, -69.99, -69.99, RETURN, DEBIT_CARD, [\'\',\' 0\',\' 0 1\',\' 0 1 2\']]]')
		assert_p('Table', 'Content', '[[69684558, 20, 280, 40118, 1, 5010, 5.01, 5.01, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [69694158, 20, 280, 40118, 1, 19000, 19.0, 19.0, RETURN, , [\'\',\' 0\',\' 0 1\',\' 0 1 2\']], [69694158, 20, 280, 40118, -1, -19000, -19.0, , RETURN, CREDIT_CARD, [\'\',\' 0\',\' 0 1\',\' 0 1 2\',\' 0 1 2 3\',\' 0 1 2 3 4\']], [69694158, 20, 280, 40118, 1, 5010, , 5.01, SALE, DEBIT_CARD, []], [63604808, 20, 170, 40118, 1, 4870, 4.87, 4.87, SALE, CHEQUE, [\'\']], [62684671, 20, 685, 40118, 1, 69990, 69.99, 69.99, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [62684671, 20, 685, 40118, -1, -69990, -69.99, -69.99, RETURN, DEBIT_CARD, [\'\',\' 0\',\' 0 1\',\' 0 1 2\']]]')
		select('Table', 'cell:11|strArray,1([\'\',\' 0\',\' 0 1\',\' 0 1 2\'])')
		select('TextField', '[\'\',\' 345 456 7\',\' 0 1\',\' 0 1 2\']')
		select('Table', 'cell:7|priceFloat,2(-19.0)')
##		assert_p('Table', 'Content', '[[69684558, 20, 280, 40118, 1, 5010, 5.01, 5.01, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [69694158, 20, 280, 40118, 1, 19000, 19.0, 19.0, RETURN, , [\'\',\' 345 456 7\',\' 0 1\',\' 0 1 2\']], [69694158, 20, 280, 40118, -1, -19000, -19.0, , RETURN, CREDIT_CARD, [\'\',\' 0\',\' 0 1\',\' 0 1 2\',\' 0 1 2 3\',\' 0 1 2 3 4\']], [69694158, 20, 280, 40118, 1, 5010, , 5.01, SALE, DEBIT_CARD, [\'\']], [63604808, 20, 170, 40118, 1, 4870, 4.87, 4.87, SALE, CHEQUE, [\'\']], [62684671, 20, 685, 40118, 1, 69990, 69.99, 69.99, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [62684671, 20, 685, 40118, -1, -69990, -69.99, -69.99, RETURN, DEBIT_CARD, [\'\',\' 0\',\' 0 1\',\' 0 1 2\']]]')

		assert_p('Table', 'Content', '[[69684558, 20, 280, 40118, 1, 5010, 5.01, 5.01, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [69694158, 20, 280, 40118, 1, 19000, 19.0, 19.0, RETURN, , [\'\',\' 345 456 7\',\' 0 1\',\' 0 1 2\']], [69694158, 20, 280, 40118, -1, -19000, -19.0, , RETURN, CREDIT_CARD, [\'\',\' 0\',\' 0 1\',\' 0 1 2\',\' 0 1 2 3\',\' 0 1 2 3 4\']], [69694158, 20, 280, 40118, 1, 5010, , 5.01, SALE, DEBIT_CARD, []], [63604808, 20, 170, 40118, 1, 4870, 4.87, 4.87, SALE, CHEQUE, [\'\']], [62684671, 20, 685, 40118, 1, 69990, 69.99, 69.99, SALE, CREDIT_CARD, [\'\',\' 0\',\' 0 1\']], [62684671, 20, 685, 40118, -1, -69990, -69.99, -69.99, RETURN, DEBIT_CARD, [\'\',\' 0\',\' 0 1\',\' 0 1 2\']]]')

	close()
