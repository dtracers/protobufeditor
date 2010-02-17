useFixture(default)

def test():
	from Modules import commonBits
	java_recorded_version = '1.5.0_11'

	if window('Protocol Buffer Editor'):
		select('FileChooser', commonBits.sampleDir() + 'Ams_LocDownload_20041228.bin')
		#commonBits.setRecordLayout(select, 'ams Store')
		click('Edit1')
		select('Table', 'rows:[1,2,3,4,5,6,7,8,9,10,11,12,13],columns:[4|Loc_Name]')
		select_menu('Data>>Table View #{Selected Records#}')
##		select('Table2', 'rows:[1,2,3,4,5,6,7,8,9,10,11,12,13],columns:[4|Loc_Name]')
		select('Table', 'rows:[2,3,4],columns:[3|Loc_Type]')
		select_menu('Edit>>Copy Record#{s#}')
		select('Table', 'cell:3|Loc_Type,11(ST)')
		select_menu('Edit>>Paste Record#{s#} Prior')
##		select('Table', 'cell:3|Loc_Type,10(ST)')
		assert_p('Table', 'Content', '[[TAR, 5850, DC, VIC West Ad Support, , Lot 2 Little Boundary Rd, Laverton, 3028, VIC, A], [TAR, 5853, DC, NSW North Sydney Ad Support, , , , , , A], [TAR, 5866, DC, WA Ad Support, , , , , , A], [TAR, 5015, ST, Bankstown, Bankstown, Unit 2, 39-41 Allingham Street, Condell Park, 2200, NSW, A], [TAR, 5019, ST, Penrith, Penrith, 58 Leland Street, Penrith, 2750, NSW, A], [TAR, 5033, ST, Blacktown, Marayong, Dock 2, 11 Melissa Place, Marayong, 2148, NSW, A], [TAR, 5035, ST, Rockdale, Building B,  Portside DC, 2-8 Mc Pherson Street, Botany, 2019, NSW, A], [TAR, 5037, ST, Miranda, Westfield Shoppingtown, Cnr. Urunga Pde & The Kingsway, Miranda, 2228, NSW, A], [TAR, 5052, ST, Eastwood, Marayong Offsite Reserve, 11 Melissa Place, Marayong, 2148, NSW, A], [TAR, 5055, ST, Leichhardt, Marketown, Marion Street, Leichhardt, 2040, NSW, A], [TAR, 5060, ST, St Marys, St. Mary\'s, Charles Hackett Drive, St Mary\'s, 2760, NSW, A], [TAR, 5866, DC, WA Ad Support, , , , , , A], [TAR, 5015, ST, Bankstown, Bankstown, Unit 2, 39-41 Allingham Street, Condell Park, 2200, NSW, A], [TAR, 5019, ST, Penrith, Penrith, 58 Leland Street, Penrith, 2750, NSW, A], [TAR, 5070, ST, Bass Hill, Bass Hill Plaza, 753 Hume Highway, Bass Hill, 2197, NSW, A], [TAR, 5074, ST, Campbelltown, Campbelltown Mall, 303 Queen Street, Campbelltown, 2560, NSW, A]]')
		select('Table', 'cell:3|Loc_Type,10(ST)')
		rightclick('Table', '4|Loc_Name,10')
		select_menu('Edit Record')
##		select('Table1', 'cell:3|Loc_Type,10(ST)')
		select('Table', 'cell:Data,5(Charles Hackett Drive)')
		assert_p('Table', 'Text', 'Charles Hackett Drive', 'Data,5')
		select('Table', 'cell:Data,4(St. Mary\'s)')
		assert_p('Table', 'Content', '[[Brand_Id, 1, , TAR, TAR], [Loc_Nbr, 2, , 5060, 5060], [Loc_Type, 3, , ST, ST], [Loc_Name, 4, , St Marys, St Marys], [Loc_Addr_Ln1, 5, , St. Mary\'s, St. Mary\'s], [Loc_Addr_Ln2, 6, , Charles Hackett Drive, Charles Hackett Drive], [Loc_Addr_Ln3, 7, , St Mary\'s, St Mary\'s], [Loc_Postcode, 8, , 2760, 2760], [Loc_State, 9, , NSW, NSW], [Loc_Actv_Ind, 10, , A, A]]')
		select('Table', 'cell:Data,4(St. Mary\'s)')
		click('Right')
		click('Right')
		select('Table', 'cell:Data,5(Unit 2, 39-41 Allingham Street)')
		assert_p('Table', 'Text', 'Unit 2, 39-41 Allingham Street', 'Data,5')
		select('Table', 'cell:Data,4(Bankstown)')
		assert_p('Table', 'Content', '[[Brand_Id, 1, , TAR, TAR], [Loc_Nbr, 2, , 5015, 5015], [Loc_Type, 3, , ST, ST], [Loc_Name, 4, , Bankstown, Bankstown], [Loc_Addr_Ln1, 5, , Bankstown, Bankstown], [Loc_Addr_Ln2, 6, , Unit 2, 39-41 Allingham Street, Unit 2, 39-41 Allingham Street], [Loc_Addr_Ln3, 7, , Condell Park, Condell Park], [Loc_Postcode, 8, , 2200, 2200], [Loc_State, 9, , NSW, NSW], [Loc_Actv_Ind, 10, , A, A]]')
		select('Table', 'cell:Data,4(Bankstown)')
		click('Right')
		select('Table', 'cell:Data,5(58 Leland Street)')
		assert_p('Table', 'Text', 'cell:Data,5(58 Leland Street)')
		select('Table', 'cell:Data,4(Penrith)')
		assert_p('Table', 'Content', '[[Brand_Id, 1, , TAR, TAR], [Loc_Nbr, 2, , 5019, 5019], [Loc_Type, 3, , ST, ST], [Loc_Name, 4, , Penrith, Penrith], [Loc_Addr_Ln1, 5, , Penrith, Penrith], [Loc_Addr_Ln2, 6, , 58 Leland Street, 58 Leland Street], [Loc_Addr_Ln3, 7, , Penrith, Penrith], [Loc_Postcode, 8, , 2750, 2750], [Loc_State, 9, , NSW, NSW], [Loc_Actv_Ind, 10, , A, A]]')
		select('Table', 'cell:Data,4(Penrith)')
		click('Right')
		select('Table', 'cell:Data,5(753 Hume Highway)')
		assert_p('Table', 'Text', 'cell:Data,5(753 Hume Highway)')
		select('Table', 'cell:Data,4(Bass Hill Plaza)')
		assert_p('Table', 'Content', '[[Brand_Id, 1, , TAR, TAR], [Loc_Nbr, 2, , 5070, 5070], [Loc_Type, 3, , ST, ST], [Loc_Name, 4, , Bass Hill, Bass Hill], [Loc_Addr_Ln1, 5, , Bass Hill Plaza, Bass Hill Plaza], [Loc_Addr_Ln2, 6, , 753 Hume Highway, 753 Hume Highway], [Loc_Addr_Ln3, 7, , Bass Hill, Bass Hill], [Loc_Postcode, 8, , 2197, 2197], [Loc_State, 9, , NSW, NSW], [Loc_Actv_Ind, 10, , A, A]]')
		select('Table', 'cell:Data,4(Bass Hill Plaza)')
		click('Right')
		select('Table', 'cell:Data,5(303 Queen Street)')
		assert_p('Table', 'Text', 'cell:Data,5(303 Queen Street)')
		select('Table', 'cell:Data,4(Campbelltown Mall)')
		assert_p('Table', 'Content', '[[Brand_Id, 1, , TAR, TAR], [Loc_Nbr, 2, , 5074, 5074], [Loc_Type, 3, , ST, ST], [Loc_Name, 4, , Campbelltown, Campbelltown], [Loc_Addr_Ln1, 5, , Campbelltown Mall, Campbelltown Mall], [Loc_Addr_Ln2, 6, , 303 Queen Street, 303 Queen Street], [Loc_Addr_Ln3, 7, , Campbelltown, Campbelltown], [Loc_Postcode, 8, , 2560, 2560], [Loc_State, 9, , NSW, NSW], [Loc_Actv_Ind, 10, , A, A]]')
		select('Table', 'cell:Data,4(Campbelltown Mall)')
		click('BasicInternalFrameTitlePane$NoFocusButton2')
		click('BasicInternalFrameTitlePane$NoFocusButton2')
		#click('WindowsInternalFrameTitlePane', 883, 7)
		click('BasicInternalFrameTitlePane$NoFocusButton2')

		if window('Save Changes to file: ' + commonBits.sampleDir() + 'Ams_LocDownload_20041228.bin'):
			click('No')
		close()
	close()