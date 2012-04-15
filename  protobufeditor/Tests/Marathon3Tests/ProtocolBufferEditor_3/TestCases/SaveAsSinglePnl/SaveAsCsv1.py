#{{{ Marathon
from default import *
#}}} Marathon

from Modules import commonBits

def test():

    set_java_recorded_version("1.6.0_22")
    if frame(' - Open File:0'):
        select('File', commonBits.sampleDir() + 'DTAR020_tst1.bin')
        ##select('Record Layout', 'DTAR020')
        commonBits.setRecordLayout(select, 'DTAR020')
        click('Edit')
    close()

    if window('Protocol Buffer Editor'):

        select_menu('File>>Export as CSV file')

        if frame('Export1 - DTAR020_tst1.bin:0'):
            select('Delimiter', ';')
            select('names on first line', 'true')
            select('Edit Output File', 'true')
            select('Keep screen open', 'true')
            click('save file')
        close()

        if frame('Table:  - DTAR020_tst1.bin.csv:0'):
            select('JTable_22', 'rows:[6],columns:[2|Store_No]')
            assert_content('JTable_22', [ ['63604808', '20', '40118', '170', '1', '4870'],
['69684558', '20', '40118', '280', '1', '19000'],
['69684558', '20', '40118', '280', '-1', '-19000'],
['69694158', '20', '40118', '280', '1', '5010'],
['62684671', '20', '40118', '685', '1', '69990'],
['62684671', '20', '40118', '685', '-1', '-69990'],
['61664713', '59', '40118', '335', '1', '17990'],
['61664713', '59', '40118', '335', '-1', '-17990'],
['61684613', '59', '40118', '335', '1', '12990'],
['68634752', '59', '40118', '410', '1', '8990'],
['60694698', '59', '40118', '620', '1', '3990'],
['60664659', '59', '40118', '620', '1', '3990'],
['60614487', '59', '40118', '878', '1', '5950'],
['68654655', '166', '40118', '60', '1', '5080'],
['69624033', '166', '40118', '80', '1', '18190'],
['60604100', '166', '40118', '80', '1', '13300'],
['68674560', '166', '40118', '170', '1', '5990']
])
            select('JTable_22', 'rows:[6],columns:[2|Store_No]')
            select('JTable_22', 'rows:[6],columns:[2|Store_No]')
            select('Layouts', 'Full Line')
            select('JTable_22', 'rows:[5],columns:[Full Line]')
            assert_content('JTable_22', [ ['63604808;20;40118;170;1;4870'],
['69684558;20;40118;280;1;19000'],
['69684558;20;40118;280;-1;-19000'],
['69694158;20;40118;280;1;5010'],
['62684671;20;40118;685;1;69990'],
['62684671;20;40118;685;-1;-69990'],
['61664713;59;40118;335;1;17990'],
['61664713;59;40118;335;-1;-17990'],
['61684613;59;40118;335;1;12990'],
['68634752;59;40118;410;1;8990'],
['60694698;59;40118;620;1;3990'],
['60664659;59;40118;620;1;3990'],
['60614487;59;40118;878;1;5950'],
['68654655;166;40118;60;1;5080'],
['69624033;166;40118;80;1;18190'],
['60604100;166;40118;80;1;13300'],
['68674560;166;40118;170;1;5990']
])
            select('JTable_22', 'rows:[5],columns:[Full Line]')
            click('Close')
##            select('JTable_22', '', '{5, Full Line}')
##            select('JTable_22', 'rows:[5],columns:[Full Line]')
        close()

        if frame('Export1 - DTAR020_tst1.bin:0'):
            select('JTable_29', 'false', '{1, Include}')
            select('JTable_29', 'false', '{4, Include}')
#            select('JTable_33', 'rows:[1],columns:[Include]')
#            select('JTable_33', 'rows:[4],columns:[Include]')
            click('save file')
        close()

        
        if frame('Table:  - DTAR020_tst1.bin.csv:0'):
            select('JTable_22', 'rows:[8],columns:[2|DATE]')
            assert_content('JTable_22', [ ['63604808', '40118', '170', '4870'],
['69684558', '40118', '280', '19000'],
['69684558', '40118', '280', '-19000'],
['69694158', '40118', '280', '5010'],
['62684671', '40118', '685', '69990'],
['62684671', '40118', '685', '-69990'],
['61664713', '40118', '335', '17990'],
['61664713', '40118', '335', '-17990'],
['61684613', '40118', '335', '12990'],
['68634752', '40118', '410', '8990'],
['60694698', '40118', '620', '3990'],
['60664659', '40118', '620', '3990'],
['60614487', '40118', '878', '5950'],
['68654655', '40118', '60', '5080'],
['69624033', '40118', '80', '18190'],
['60604100', '40118', '80', '13300'],
['68674560', '40118', '170', '5990']
])
            select('JTable_22', 'rows:[8],columns:[2|DATE]')
            select('JTable_22', 'rows:[8],columns:[2|DATE]')
            select('Layouts', 'Full Line')
            select('JTable_22', 'rows:[6],columns:[Full Line]')
            assert_content('JTable_22', [ ['63604808;40118;170;4870'],
['69684558;40118;280;19000'],
['69684558;40118;280;-19000'],
['69694158;40118;280;5010'],
['62684671;40118;685;69990'],
['62684671;40118;685;-69990'],
['61664713;40118;335;17990'],
['61664713;40118;335;-17990'],
['61684613;40118;335;12990'],
['68634752;40118;410;8990'],
['60694698;40118;620;3990'],
['60664659;40118;620;3990'],
['60614487;40118;878;5950'],
['68654655;40118;60;5080'],
['69624033;40118;80;18190'],
['60604100;40118;80;13300'],
['68674560;40118;170;5990']
])
            select('JTable_22', 'rows:[6],columns:[Full Line]')
            click('Close')
##            select('JTable_22', '', '{6, Full Line}')
##            select('JTable_22', 'rows:[6],columns:[Full Line]')
        close()

        if frame('Export1 - DTAR020_tst1.bin:0'):
            select('names on first line', 'false')
            click('save file')
        close()

        if frame('Table:  - DTAR020_tst1.bin.csv:0'):
            select('JTable_22', 'rows:[5],columns:[2|DATE]')
            assert_content('JTable_22', [ ['63604808', '40118', '170', '4870'],
['69684558', '40118', '280', '19000'],
['69684558', '40118', '280', '-19000'],
['69694158', '40118', '280', '5010'],
['62684671', '40118', '685', '69990'],
['62684671', '40118', '685', '-69990'],
['61664713', '40118', '335', '17990'],
['61664713', '40118', '335', '-17990'],
['61684613', '40118', '335', '12990'],
['68634752', '40118', '410', '8990'],
['60694698', '40118', '620', '3990'],
['60664659', '40118', '620', '3990'],
['60614487', '40118', '878', '5950'],
['68654655', '40118', '60', '5080'],
['69624033', '40118', '80', '18190'],
['60604100', '40118', '80', '13300'],
['68674560', '40118', '170', '5990']
])
            select('JTable_22', 'rows:[5],columns:[2|DATE]')
            click('Close')
##            select('JTable_22', '', '{5, 2|DATE}')
##            select('JTable_22', 'rows:[5],columns:[2|DATE]')
        close()

        if frame('Export1 - DTAR020_tst1.bin:0'):
            select('JTable_29', 'true', '{1, Include}')
            select('JTable_29', 'true', '{4, Include}')
#           select('JTable_33', 'rows:[1],columns:[Include]')
#           select('JTable_33', 'rows:[4],columns:[Include]')
            select('Delimiter', '|')
            select('Add Quote to all Text Fields', 'true')
            click('save file')
        close()

        if frame('Table:  - DTAR020_tst1.bin.csv:0'):
            select('JTable_22', 'rows:[6],columns:[3|DATE]')
            assert_content('JTable_22', [ ['63604808', '20', '40118', '170', '1', '4870'],
['69684558', '20', '40118', '280', '1', '19000'],
['69684558', '20', '40118', '280', '-1', '-19000'],
['69694158', '20', '40118', '280', '1', '5010'],
['62684671', '20', '40118', '685', '1', '69990'],
['62684671', '20', '40118', '685', '-1', '-69990'],
['61664713', '59', '40118', '335', '1', '17990'],
['61664713', '59', '40118', '335', '-1', '-17990'],
['61684613', '59', '40118', '335', '1', '12990'],
['68634752', '59', '40118', '410', '1', '8990'],
['60694698', '59', '40118', '620', '1', '3990'],
['60664659', '59', '40118', '620', '1', '3990'],
['60614487', '59', '40118', '878', '1', '5950'],
['68654655', '166', '40118', '60', '1', '5080'],
['69624033', '166', '40118', '80', '1', '18190'],            
['60604100', '166', '40118', '80', '1', '13300'],                                                                          
['68674560', '166', '40118', '170', '1', '5990']
])
            select('JTable_22', 'rows:[6],columns:[3|DATE]')
            select('JTable_22', 'rows:[6],columns:[3|DATE]')
            select('Layouts', 'Full Line')
            select('JTable_22', 'rows:[7],columns:[Full Line]')
            assert_content('JTable_22', [ ['63604808|20|40118|170|1|4870'],
['69684558|20|40118|280|1|19000'],
['69684558|20|40118|280|-1|-19000'],
['69694158|20|40118|280|1|5010'],
['62684671|20|40118|685|1|69990'],
['62684671|20|40118|685|-1|-69990'],
['61664713|59|40118|335|1|17990'],
['61664713|59|40118|335|-1|-17990'],
['61684613|59|40118|335|1|12990'],
['68634752|59|40118|410|1|8990'],
['60694698|59|40118|620|1|3990'],
['60664659|59|40118|620|1|3990'],
['60614487|59|40118|878|1|5950'],
['68654655|166|40118|60|1|5080'],
['69624033|166|40118|80|1|18190'],
['60604100|166|40118|80|1|13300'],
['68674560|166|40118|170|1|5990']
])
            select('JTable_22', 'rows:[7],columns:[Full Line]')
            click('Close')
##            select('JTable_22', '', '{7, Full Line}')
##            select('JTable_22', 'rows:[7],columns:[Full Line]')
        close()

        if frame('Export1 - DTAR020_tst1.bin:0'):
            select('Add Quote to all Text Fields', 'false')
            select('Delimiter', '~')
            click('save file')
        close()

        if frame('Table:  - DTAR020_tst1.bin.csv:0'):
            select('JTable_22', 'rows:[6],columns:[3|DATE]')
            assert_content('JTable_22', [ ['63604808', '20', '40118', '170', '1', '4870'],
['69684558', '20', '40118', '280', '1', '19000'],
['69684558', '20', '40118', '280', '-1', '-19000'],
['69694158', '20', '40118', '280', '1', '5010'],
['62684671', '20', '40118', '685', '1', '69990'],
['62684671', '20', '40118', '685', '-1', '-69990'],
['61664713', '59', '40118', '335', '1', '17990'],
['61664713', '59', '40118', '335', '-1', '-17990'],
['61684613', '59', '40118', '335', '1', '12990'],
['68634752', '59', '40118', '410', '1', '8990'],
['60694698', '59', '40118', '620', '1', '3990'],
['60664659', '59', '40118', '620', '1', '3990'],
['60614487', '59', '40118', '878', '1', '5950'],
['68654655', '166', '40118', '60', '1', '5080'],
['69624033', '166', '40118', '80', '1', '18190'],
['60604100', '166', '40118', '80', '1', '13300'],
['68674560', '166', '40118', '170', '1', '5990']
])
            select('JTable_22', 'rows:[6],columns:[3|DATE]')
            select('JTable_22', 'rows:[6],columns:[3|DATE]')
            select('Layouts', 'Full Line')
            select('JTable_22', 'rows:[6],columns:[Full Line]')
##            assert_p('JViewport_21', 'Enabled', 'true')
            select('JTable_22', 'rows:[5],columns:[Full Line]')
            select('JTable_22', 'rows:[5],columns:[Full Line]')
            assert_content('JTable_22', [ ['63604808~20~40118~170~1~4870'],
['69684558~20~40118~280~1~19000'],
['69684558~20~40118~280~-1~-19000'],
['69694158~20~40118~280~1~5010'],
['62684671~20~40118~685~1~69990'],
['62684671~20~40118~685~-1~-69990'],
['61664713~59~40118~335~1~17990'],
['61664713~59~40118~335~-1~-17990'],
['61684613~59~40118~335~1~12990'],
['68634752~59~40118~410~1~8990'],
['60694698~59~40118~620~1~3990'],
['60664659~59~40118~620~1~3990'],
['60614487~59~40118~878~1~5950'],
['68654655~166~40118~60~1~5080'],
['69624033~166~40118~80~1~18190'],
['60604100~166~40118~80~1~13300'],
['68674560~166~40118~170~1~5990']
])
            select('JTable_22', 'rows:[5],columns:[Full Line]')
            click('Close')
##            select('JTable_22', '', '{5, Full Line}')
##            select('JTable_22', 'rows:[5],columns:[Full Line]')
        close()

##        window_closed('Record Editor')
    close()

    pass
