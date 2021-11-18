package com.example.londonbaby;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {

    public enum Places {
        AbbaeioTouOuestminster,
        AnaktoroTouMpakinxam,
        BretanikoMouseio,
        PiccardiSquare,
        PurgosTouLondinou,
        LondonEye,
        StPaulsCathedral,
        MadameTussads,
        LondonTowerBridge,
        MouseioFusikisIstorias,
        BigBen,
        Harrods,
        Selfridges,
        AlbertMemorial,
        RoyalAlbertHall,
        MarpleArch,
        Shard,
        StatueOfEros,
        Chinatown
    };

    String abbaeioTouOuestminsterText = "Κάθε χρόνο, το Αββαείο του Ουέστμινστερ υποδέχεται πάνω από χίλιους επισκέπτες. Όλοι παραδέχονται ότι η τιμή και οι ουρές για να το επισκεφτείτε αξίζουν. Το 700 ετών κτίριο έχει φιλοξενήσει, σύμφωνα με την επίσημη ιστοσελίδα, “Βασιλιάδες, βασίλισσες, πολιτικούς και στρατιώτες, ποιητές, ιερείς, ήρωες και κακοποιούς”.";
    String anaktoroTouMpakinxam = "Θα έχετε ακούσει για το Ανάκτορο του Μπάκινχαμ, αλλά τώρα ήρθε η ώρα και να το επισκεφτείτε. Ως κατοικία της Βασιλικής οικογένειας, στο Ανάκτορο έχουν βρεθεί πάνω από 50,000 επισκέπτες για εκδηλώσεις και εορτασμούς. Βεβαιωθείτε ότι θα το επισκεφτείτε όταν είναι ανοχιτό προς το κοινό, κάτι που δε συμβαίνει πολύ συχνά.";
    String bretanikoMouseio = "Είναι ένα από τα δωρεάν αξιοθέατα του Λονδίνου, με πολλούς να το θεωρούν ως το καλύτερο μουσείο. Προσφέρει αρχιτεκτονική ομορφιά και στεγάζει μια τεράστια συλλογή από χειροποίητα αντικείμενα και έργα τέχνης από κάθε γωνιά του πλανήτη. Εκεί θα βρείτε, φυσικά, και τα Μάρμαρα του Παρθενώνα. Πρόκειται για ένα πολύ μεγάλο μουσείο, επομένως φροντίστε να φορέσετε άνετα παπούτσια για να το γυρίσετε.";
    String piccardiSquare = "Η Πλατεία Πικαντίλι είναι κάτι παρόμοιο με την Time’s Square στη Νέα Υόρκη, αφού προσφέρει την ίδια ζωντάνια. Μπορείτε να βγείτε, να κάνετε clubbing, να πάτε σε μπαράκια κι hip εστιατόρια, και το σημαντικότερο, να νιώσετε τη “βουή” και την ενέργεια των εκατομμυρίων ανθρώπων που βρίσκονται γύρω σας. Πρέπει, ασφαλώς, να ξέρετε, ότι ΔΕΝ πρόκειται για τσίρκο, όπως πιστεύουν πολλοί αρχάριοι επισκέπτες, αλλά το όνομά του αναφέρεται στο κυκλικό σχήμα της πλατείας.";
    String purgosTouLondinou = "Πρόκειται για ένα από τα τέσσερα μνημεία Παγκόσμιας Κληρονομιάς της UNESCO στο Λονδίνο κι ένα από τα δημοφιλέστερα αξιοθέατα στην πόλη. Με το πέρασμα της ιστορίας, ο Πύργος αξιοποιήθηκε με πολλούς διαφορετικούς τρόπους, όπως βασιλικό παλάτι, οπλοστάσιο, φυλακή, αίθουσα εκτελέσεων, στρατώνας, ζωολογικός κήπος και κοσμηματοπωλείο. Με 1000 χρόνια ιστορίας, αναμφίβολα είναι ένα μέρος που προσφέρει δυνατές συγκινήσεις στον επισκέπτη του.";
    String londonEye = "Η καλύτερη πανοραμική θέα του Λονδίνου, πάνω από την τεράστια ρόδα που φτιάχτηκε για να υποδεχτεί το Millenium και τελικά… έμεινε – κι έγινε από τα landmarks της πόλης (www.londoneye.com)." + "Ο διάσημος τροχός ύψους 135 μέτρων αναγέρθηκε το 2000 και αποτελεί ένα από τα πλέον διάσημα αξιοθέατα της πόλης. Πάνω του είναι τοποθετημένοι 32 θαλαμίσκοι χωρητικότητας 25 ατόμων έκαστος, ενώ μία πλήρης περιστροφή του διαρκεί 30 λεπτά της ώρας.\n" +
                               "\n" + "Το εισιτήριο κοστίζει 22,50 λίρες (περιλαμβάνεται στην προσφορά Two for One της χάρτινης travelcard) και σε πρώτη φάση σας δίνει τη δυνατότητα να παρακολουθήσετε σε μία αίθουσα ένα ολιγόλεπτο αλλά εντυπωσιακό 4D βίντεο, στο οποίο είστε γλάρος και βλέπετε το Eye από ψηλά. Το ημίωρο στο ίδιο το αξιοθέατο είναι πολύ ενδιαφέρον καθώς σας παρέχει εντυπωσιακή θέα από ψηλά προς ολόκληρη την πόλη, μάλιστα τις ημέρες που υπάρχει ηλιοφάνεια μπορείτε να δείτε ακόμα και 40 χιλιόμετρα μακριά.\n" +
                               "\n" + "Προτιμήστε να καθίσετε μέσα και αριστερά όπως μπαίνετε στο θάλαμο καθώς η πιο ενδιαφέρουσα θέα είναι προς το Γουέστμινστερ, το Κοινοβούλιο και το Big Ben, σε κάθε περίπτωση αξίζει και με το παραπάνω να επισκεφτείτε το London Eye!";
    String stPaulsCathedral = "Το δημιούργημα του sir Christopher Wren στέκεται μεγαλοπρεπώς, με τον επιβλητικό τρούλο του να ξεχωρίζει από μακριά. Εντυπωσιακές αίθουσες, εκπληκτικές καλλιτεχνικές συλλογές και μοναδική θέα από τον τρούλο (www.stpauls.co.uk).";
    String madameTussadsText = "Κέρινα ομοιώματα πολιτικών, αθλητών, καλλιτεχνών του διεθνούς στερεώματος. Μολονότι κιτς και τσιμπημένο, μαζεύει καθημερινά χιλιάδες τουρίστες. Αν θέλετε να καλύψετε τα must see του πρωτάρη στο Λονδίνο, περάστε μια βόλτα (www.madametussauds.co.uk)";
    String londonTowerBridgeText = "Αξίζει να κλείσετε online εισιτήρια για την Tower Bridge Exhibition για να μάθετε τα πάντα σχετικά με την ιστορία και τον μηχανισμό ανέλκυσης της γέφυρας αλλά και για να δείτε τον κόσμο «αλλιώς», από επάνω προς τα κάτω, από το περίφημο Glass Floor Walkaway, έναν διάδρομο με γυάλινο πάτωμα που ενώνει τους δύο πύργους και βρίσκεται σε ύψος 42 μέτρων πάνω από τον Τάμεση! Από το Glass Floor Walkaway θα έχετε απίθανη θέα σε μερικά από τα πιο σημαντικά αξιοθέατα της πόλης όπως τον Καθεδρικό Ναό του Αγ. Παύλου και το Μνημείο της Μεγάλης Πυρκαγιάς του Λονδίνου στα δυτικά και τις Αποβάθρες της Αγ. Αικατερίνης (St Katharine Docks) που οδηγούν στο περίφημο skyline της περιοχής Canary Wharf στα ανατολικά.\n" +
                                       "\n" + "Tip: Στον επίσημο ιστότοπο της London Tower Bridge μπορείτε να τσεκάρετε ποιες ημέρες και ώρες σηκώνεται η γέφυρα ώστε να την απολαύσετε «εν δράσει»!";
    String mouseioFusikisIstoriasText = "Στην αριστοκρατική συνοικία του Σάουθ Κένσινγκτον στεγάζονται τα σημαντικά μουσεία της Φυσικής Ιστορίας, των Επιστημών και των Bικτόρια και Άλμπερτ, η είσοδος για τα οποία λαμβάνει χώρα χωρίς χρηματικό αντίτιμο.\n" +
                                            "\n" + "Το μουσείο Φυσικής Ιστορίας του Λονδίνου είναι από τα διασημότερα του είδους και παρουσιάζει με εκθέματα και διαδραστικές τεχνικές την εξέλιξη του πλανήτη, των ορυκτών, των ζώων αλλά και των ανθρώπων.\n" +
                                            "\n" + "Σημαντικότερος τομέας του μουσείου αν μη τι άλλο είναι αυτός που φιλοξενεί τα εντυπωσιακά ομοιώματα και τα απολιθώματα των σκελετών και των αυγών των δεινοσαύρων, ενώ ξεχωρίζει και η πλούσια συλλογή πετρωμάτων από μετεωρίτη μέχρι πολύτιμες πέτρες χωρίς να λείπουν κι από εδώ νομίσματα και κοσμήματα από τον ελλαδικό χώρο.\n" +
                                            "\n" + "Να υπολογίζετε πως η επίσκεψη θα διαρκέσει τουλάχιστον δύο ώρες.";

    String bigBenText = "Μπιγκ Μπεν λέγεται η μεγάλη καμπάνα και το ρολόι στο βόρειο άκρο των ανακτόρων του Ουεστμίνστερ στο Λονδίνο. γενικότερα παραπέμπει στο ρολόι ή τον πύργο του ρολογιού. Είναι το μεγαλύτερο τεσσάρων όψεων ρολόι με καμπάνες και ο πύργος του ρολογιού είναι ο τρίτος ψηλότερος στον κόσμο. Η ανέγερση του πύργου ολοκληρώθηκε στις 10 Απριλίου 1858. Ο πύργος του ρολογιού έχει γίνει ένα από τα πιο γνωστά σύμβολα τόσο του Λονδίνου όσο και της Αγγλίας, συχνά στην \"establishing shot\" των ταινιών που γυρίζονται στην πόλη.\n" +
            "Ο τωρινός Πύργος του Ρολογιού ανεγέρθηκε ως μέρος του σχεδιασμού του Charles Barry για ένα νέο ανάκτορο, μετά από την καταστροφή του παλιού παλατιού του Ουέστμινστερ από πυρκαγιά το βράδυ της 16ης Οκτωβρίου 1834. Το νέο Κοινοβούλιο χτίστηκε σε νεογοτθικό στιλ. Αν και ο Barry ήταν ο κύριος αρχιτέκτονας του ανακτόρου, στράφηκε στον Αύγουστο Pugin για το σχεδιασμό του Πύργου του Ρολογιού, το οποίο μοιάζει σε νωρίτερα σχέδια του Pugin , συμπεριλαμβανομένου ενός για το Scarisbrick Hall. Ο σχεδιασμός για τον Πύργο του Ρολογιού ήταν το τελευταίο σχέδιο του Pugin πριν από την τελική κάθοδό του στην τρέλα και τον θάνατο, και ο ίδιος ο Pugin έγραψε, κατά το χρόνο της τελευταίας επίσκεψης του Barry για να εισπράξει τα σχέδια: «Εγώ ποτέ δεν δούλεψα τόσο σκληρά στη ζωή μου για τον κ. Barry για αύριο πρόσφερα όλα τα σχέδια για το τελείωμα του καμπαναριού του και αυτό είναι όμορφο ». Ο πύργος είναι σχεδιασμένος στο αγαπημένο γοτθικό σχέδιο του Pugin, και είναι 96,3 μέτρα (316 πόδια) υψηλό (περίπου 16 όροφοι).\n" +
                                "\n" + "Το κάτω μέρος 61 μέτρα (200 πόδια) της δομής του Πύργος του Ρολογιού αποτελείται από πλινθοδομή με άμμο χρωματισμένα με Anston επένδυση ασβεστόλιθο. Το υπόλοιπο του ύψους του πύργου είναι πλαισιωμένο κωδωνοστάσιο από χυτοσίδηρο. Ο πύργος είναι θεμελιωμένος σε πέδιλο μήκους 15 μέτρων (49 \u200B\u200Bπόδια), από 3 μ. (9,8 ft) πάχους μπετόν, σε βάθος 4 μέτρα (13 πόδια) κάτω από το επίπεδο του εδάφους. Οι τέσσερις πίνακες του ρολογιού βρίσκεται 55 μέτρα (180 πόδια) πάνω από το έδαφος. Ο εσωτερικός όγκος του πύργου είναι 4.650 κυβικά μέτρα (164.200 κυβικά πόδια).\n" +
                                "\n" + "Παρά το γεγονότα τα πιο διάσημα τουριστικά αξιοθέατα του κόσμου, το εσωτερικό του πύργου δεν είναι ανοιχτό σε επισκέπτες από το εξωτερικό.Επίσης, ο πύργος δεν διαθέτει ανελκυστήρα, έτσι για να ανεβείτε τα 334 σκαλοπάτια από το ασβεστόλιθο στην κορυφή.\n" +
                                "\n" + "Λόγω των αλλαγών στις συνθήκες του εδάφους από την κατασκευή (κυρίως σήραγγας για την επέκταση γραμμής Jubilee), ο πύργος κλίνει ελαφρώς προς τα βορειοδυτικά, κατά περίπου 220 χιλιοστά στο καντράν ρολογιού, δίνοντας μια κλίση περίπου 1 / 250. Το Μπιγκ Μπεν επρόκειτο να ηχήσει για τρία λεπτά πριν από την έναρξη της τελετής έναρξης των Ολυμπιακών Αγώνων της Μεγάλης Βρετανίας.";

    String harrodsText = "Το Harrods είναι πολυτελές πολυκατάστημα που βρίσκεται στην οδό Μπρόμπτον(D/R) στο Νάιτσμπριτζ(D/R) του Λονδίνου. Είναι ιδιοκτησία του κράτους του Κατάρ. Το σύνθημα του Harrods είναι η λατινική φράση Omnia Omnibus Ubique, που σημαίνει «όλα τα πράγματα για όλους τους ανθρώπους, παντού». Αρκετές από τις υπηρεσίες του Harrods, είναι ευρέως γνωστές συμπεριλαμβανομένων και των εποχιακών χριστουγεννιάτικων τμημάτων αλλά και τις αίθουσες φαγητού.";

    String selfridgesText= "Selfridges, also known as Selfridges & Co., is a chain of high-end department stores in the United Kingdom that is operated by Canadian group Selfridges Retail Limited, part of the Selfridges Group of department stores.[1] It was founded by Harry Gordon Selfridge in 1908.[1]\n" +
                                   "\n" + "The flagship store on London's Oxford Street is the second largest shop in the UK (after Harrods) and opened on 15 March 1909.[4] Other Selfridges stores opened in the Trafford Centre (1998) and Exchange Square (2002) in Manchester, and in the Bullring in Birmingham (2003).\n" +
                                   "\n" + "In the 1940s, smaller provincial Selfridges stores were sold to the John Lewis Partnership, and in 1951, the original Oxford Street store was acquired by the Liverpool-based Lewis's chain of department stores.[5] Lewis's and Selfridges were then taken over in 1965 by the Sears Group, owned by Charles Clore.[6] Expanded under the Sears Group to include branches in Manchester and Birmingham,[7] the chain was acquired in 2003 by Canada's Galen Weston for £598 million.[8]\n" +
                                   "\n" + "The shop's early history was dramatised in ITV's 2013 series, Mr Selfridge.[9] It was briefly a member of the International Association of Department Stores from 1951 to 1953.";

    String albertMemorialText = "The Albert Memorial, directly north of the Royal Albert Hall in Kensington Gardens, London, was commissioned by Queen Victoria in memory of her beloved husband Prince Albert, who died in 1861. Designed by Sir George Gilbert Scott in the Gothic Revival style, it takes the form of an ornate canopy or pavilion 176 feet (54 m) tall, in the style of a Gothic ciborium over the high altar of a church,[1] sheltering a statue of the prince facing south. It took over ten years to complete, the £120,000 cost (the equivalent of about £10,000,000 in 2010) met by public subscription.\n" +
                                        "\n" + "The memorial was opened in July 1872 by Queen Victoria, with the statue of Albert ceremonially \"seated\" in 1876.[2] It has been Grade I listed since 1970.[3]";

    String royalAlbertHall = "Η Βασιλική Αίθουσα του Αλβέρτου (αγγλικά: Royal Albert Hall) είναι αίθουσα συναυλιών στο Λονδίνο. Πρόκειται για ένα ιστορικό κτήριο σχήματος ροτόντας που βρίσκεται στην περιοχή του νοτίου Κένσινγκτον, γνωστότερη ως Αλβερτόπολη."
            +"\n" + "Ιστορία: Την ιδέα της δημιουργίας του είχε ο φιλόμουσος και ερασιτέχνης συνθέτης βασιλικός σύζυγος της Βασίλισσας Βικτωρίας, πρίγκιπας Αλβέρτος όταν στα πλαίσια της μεγάλης έκθεσης του Λονδίνου που πραγματοποιήθηκε στο Χάιντ Παρκ το 1851, της οποίας ήταν πρόεδρος, βλέποντας το Κρύσταλ Πάλας που είχε ανεγερθεί τότε για τις ανάγκες της έκθεσης και που σημείωσε μεγάλη επιτυχία ανήγγειλε την ανάγκη της μελλοντικής ίδρυσης μιας μόνιμης μεγάλης αίθουσας τεχνών και επιστημών. Το 1861 πέθανε ο πρίγκιπας Αλβέρτος χωρίς να προλάβει να δει την ιδέα του να πραγματοποιείται. Τότε αποφασίστηκε να ξεκινήσουν οι διεργασίες της πραγμάτωσης του ονείρου του. Ένα μέρος των χρημάτων δόθηκε από τα έσοδα της προηγούμενης έκθεσης ενώ το μεγαλύτερο μέρος καλύφθηκε από δημόσιο έρανο που ενέκρινε η Βασίλισσα. Έτσι στις 20 Μαΐου του 1867 η Βασίλισσα Βικτώρια έθεσε το θεμέλιο λίθο ονομάζοντας το υπό ανέγερση κτίριο \"Ρόγιαλ Άλμπερτ Χωλ\" τιμώντας το νεκρό σύζυγό της.";

    String marpleArch = "Marble Arch is a 19th-century white marble-faced triumphal arch in London, England. The structure was designed by John Nash in 1827 to be the state entrance to the cour d'honneur of Buckingham Palace; it stood near the site of what is today the three-bayed, central projection of the palace containing the well-known balcony.[1] In 1851, on the initiative of architect and urban planner Decimus Burton, a one-time pupil of John Nash, it was relocated to its current site. Following the widening of Park Lane in the early 1960s, the site became a large traffic island at the junction of Oxford Street, Park Lane and Edgware Road, isolating the arch. Admiralty Arch, Holyhead in Wales is a similar arch, also cut off from public access, at the other end of the A5.\n" +
                                "\n" + "Only members of the Royal Family and the King's Troop, Royal Horse Artillery are said to be permitted to pass through the arch; this happens in ceremonial processions.[2]\n" +
                                "\n" + "The arch gives its name to the area surrounding it, particularly the southern portion of Edgware Road and also to the underground station. The arch is not part of the Royal Parks and is maintained by Westminster City Council.";

    String shard = "Το Σαρντ (αγγλικά: The Shard, επίσης Shard London Bridge και London Bridge Tower) είναι ένας ουρανοξύστης στο Λονδίνο. Με ύψος 309,6 μέτρα είναι το ψηλότερο κτίριο στo Ηνωμένο Βασίλειο και 7ο ψηλότερο Ευρώπη και η δεύτερη ψηλότερη κατασκευή στο Ηνωμένο Βασίλειο μετά το τηλεπικοινωνιακό πύργο Έλμεϊ Μουρ, ο οποίος έχει ύψος 330 μέτρα. Η κατασκευή του ολοκληρώθηκε τις 30 Μαρτίου 2012 και τα επίσημα εγκαίνια έλαβαν χώρα στις 5 Ιουλίου 2012.\n" +
            "\n" + "Το Σαρντ αντικατέστησε το πύργο Σάουθγουορκ, ένα κτίριο γραφείων με 24 ορόφους, κατασκευασμένο στο Σαουθγουόρκ το 1975. Ο Ρέντσο Πιάνο συνεργαστήκε με τη Μπροντγουέι Μαλίαν για τα πρώτα στάδια του σχεδιασμού του κτιρίου. Έχει 95 ορόφους συνολικά, από τους οποίους αξιοποιούνται οι 72. Στον 72ο όροφο, σε ύψος 245 μέτρων βρίσκεται το υψηλότερο παρατηρητήριο στο Λονδίνο. Έχει σχήμα ακανόνιστης πυραμίδας. Η κατασκευή του έχει προκαλέσει έντονη κριτική, καθώς θεωρήθηκε ότι καταστρέφει το αστικό τοπίο του Λονδίνου και επισκιάζει τη γέφυρα του Πύργου και τον καθεδρικό του Αγίου Παύλου, δύο από τα πιο διάσημα μνημεία του Λονδίνου.";

    String statueOfEros = "Το Shaftesbury Memorial Fountain, δημοφιλές αλλά λανθασμένα γνωστό ως \"Eros\", είναι ένα σιντριβάνι που περιβάλλεται από ένα φτερωτό άγαλμα του Anteros (αδερφός του Έρως αντι-Έρως), που βρίσκεται στη νοτιοανατολική πλευρά του Piccadilly Circus στο Λονδίνο της Αγγλίας. Σε αυτό το σημείο ήρθε μετά τον Δεύτερο Παγκόσμιο Πόλεμο. ";

    String chinaTown = "Βρίσκεται δίπλα από το Piccadily Circus. Είναι από τις πιο γνωστές Chinatown στον κόσμο, είναι πολύ τουραστική με πολλά μαγαζιά και ένα ωραίο μέρος για βόλτα. Πολλά κινέζικα εστιατόρια στο Λονδίνο είναι τύπου μπουφέ, φάε όσο μπορείς και πληρώνεις 10 ευρώ.";

    String location = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGoogleMaps();
            }
        });

        TextView textView = findViewById(R.id.textview_contentscrolling_text);

        Places place = (Places) getIntent().getExtras().get("place");

        switch (place){
            case AbbaeioTouOuestminster:
                toolBarLayout.setTitle(getResources().getString(R.string.abbaeiotououestminster));
                toolBarLayout.setBackground(getDrawable(R.drawable.abbaeio_tou_ouestminster));
                textView.setText(abbaeioTouOuestminsterText);

                location = "51.50217146422497, -0.12753915742413538";
                break;

            case AnaktoroTouMpakinxam:
                toolBarLayout.setTitle(getResources().getString(R.string.anaktoroTouMpakinxam));
                toolBarLayout.setBackground(getDrawable(R.drawable.anaktoro_tou_mpakinxam));
                textView.setText(anaktoroTouMpakinxam);

                location = "51.503240017957395,-0.14178705148241785";
                break;

            case BretanikoMouseio:
                toolBarLayout.setTitle(getResources().getString(R.string.bretanikoMouseio));
                toolBarLayout.setBackground(getDrawable(R.drawable.bretaniko_mouseio));
                textView.setText(bretanikoMouseio);

                location = "51.52140159807511,-0.12771081879833154";
                break;

            case PiccardiSquare:
                toolBarLayout.setTitle(getResources().getString(R.string.piccardiSquare));
                toolBarLayout.setBackground(getDrawable(R.drawable.piccardi_square));
                textView.setText(piccardiSquare);

                location = "51.51010481778367,-0.13452973304280164";
                break;

            case PurgosTouLondinou:
                toolBarLayout.setTitle(getResources().getString(R.string.purgosTouLondinou));
                toolBarLayout.setBackground(getDrawable(R.drawable.purgos_tou_londinou));
                textView.setText(purgosTouLondinou);

                location = "51.51029184420654,-0.0758690837910868";
                break;

            case LondonEye:
                toolBarLayout.setTitle(getResources().getString(R.string.londonEye));
                toolBarLayout.setBackground(getDrawable(R.drawable.london_eye));
                textView.setText(londonEye);

                location = "51.50341081185328,-0.11911381955073574";
                break;

            case StPaulsCathedral:
                toolBarLayout.setTitle(getResources().getString(R.string.stPaulsCathedral));
                toolBarLayout.setBackground(getDrawable(R.drawable.st_pauls_cathedral));
                textView.setText(stPaulsCathedral);

                location = "51.51509928182598,-0.09852838518498187";
                break;

            case MadameTussads:
                toolBarLayout.setTitle(getResources().getString(R.string.madameTussads));
                toolBarLayout.setBackground(getDrawable(R.drawable.madame_tussads));
                textView.setText(madameTussadsText);

                location = "51.524926242126455,-0.15294504080516919";
                break;

            case LondonTowerBridge:
                toolBarLayout.setTitle(getResources().getString(R.string.londonTowerBridge));
                toolBarLayout.setBackground(getDrawable(R.drawable.london_tower_bridge));
                textView.setText(londonTowerBridgeText);

                location = "51.5077276700287,-0.07501077692010594";
                break;

            case MouseioFusikisIstorias:
                toolBarLayout.setTitle(getResources().getString(R.string.mouseioFusikisIstorias));
                toolBarLayout.setBackground(getDrawable(R.drawable.mouseio_fusikis_istorias));
                textView.setText(mouseioFusikisIstoriasText);

                location = "51.49864505913568,-0.17697763319263365";
                break;

            case BigBen:
                toolBarLayout.setTitle(getResources().getString(R.string.bigBen));
                toolBarLayout.setBackground(getDrawable(R.drawable.big_ben));
                textView.setText(bigBenText);

                location = "51.503453725697206,-0.12479257543699657";
                break;

            case Harrods:
                toolBarLayout.setTitle(getResources().getString(R.string.harrods));
                toolBarLayout.setBackground(getDrawable(R.drawable.harrods));
                textView.setText(harrodsText);

                location = "51.508958865390845,-0.15371442794816087";
                break;

            case Selfridges:
                toolBarLayout.setTitle(getResources().getString(R.string.selfridges));
                toolBarLayout.setBackground(getDrawable(R.drawable.selfridges));
                textView.setText(selfridgesText);

                location = "51.514530107406486,-0.1527777305446616";
                break;

            case AlbertMemorial:
                toolBarLayout.setTitle(getResources().getString(R.string.albertMemorial));
                toolBarLayout.setBackground(getDrawable(R.drawable.albert_memorial));
                textView.setText(albertMemorialText);

                location = "51.5025118636579,-0.1777284593810015";
                break;

            case RoyalAlbertHall:
                toolBarLayout.setTitle(getResources().getString(R.string.royalAlbertHall));
                toolBarLayout.setBackground(getDrawable(R.drawable.royal_ambert_hall));
                textView.setText(royalAlbertHall);

                location = "51.5010423539217,-0.17732308647867379";
                break;

            case MarpleArch:
                toolBarLayout.setTitle(getResources().getString(R.string.marpleArch));
                toolBarLayout.setBackground(getDrawable(R.drawable.marple_arch));
                textView.setText(marpleArch);

                location = "51.51328347964058,-0.15890407298585052";
                break;

            case Shard:
                toolBarLayout.setTitle(getResources().getString(R.string.shard));
                toolBarLayout.setBackground(getDrawable(R.drawable.the_shard));
                textView.setText(shard);

                location = "51.50513827322078,-0.08652307007557873";
                break;

            case StatueOfEros:
                toolBarLayout.setTitle(getResources().getString(R.string.statueOfEros));
                toolBarLayout.setBackground(getDrawable(R.drawable.agalma_eros));
                textView.setText(statueOfEros);

                location = "51.5100840864944,-0.13439438315619157";
                break;

            case Chinatown:
                toolBarLayout.setTitle(getResources().getString(R.string.chinatown));
                toolBarLayout.setBackground(getDrawable(R.drawable.chinatown));
                textView.setText(chinaTown);

                location = "51.512933457120454,-0.13095704582582932";
                break;
        }
    }

    private void openGoogleMaps()
    {
        try{
            Uri gmmIntentUri = Uri.parse("geo:"+location);

            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

            mapIntent.setPackage("com.google.android.apps.maps");

            startActivity(mapIntent);
        }
        catch(Exception e){}
    }
}