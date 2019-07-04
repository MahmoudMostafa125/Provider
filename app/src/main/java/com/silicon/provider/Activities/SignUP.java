package com.silicon.provider.Activities;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.silicon.provider.R;
import com.silicon.provider.Utilities.NothingSelectedSpinnerAdapter;

import java.util.ArrayList;
import java.util.List;

import static android.graphics.Color.BLACK;
import static android.graphics.Color.BLUE;

public class SignUP extends AppCompatActivity {

    ImageView imageViewEdu, Imge;
    LinearLayout linearLayoutEdu;
    TextView textViewEdu;
    Context context;
    Spinner SpinnerEdu, SpinnerEllearning;
    ArrayAdapter<String> adapter,adapterE;
    public static List<String> SpinnerListEmp, SpinnerListElearnig;

    private Animation animShow, animHide, animShowre, animHidere;

    LinearLayout linearLayoutSelect, linearLayoutUni, LinearLayoutFac, LinearLayoutsec, linearLayoutData, linearLayoutVer, linearLayoutFL;

    Button buttonSelectPro, buttonPreviouspro, buttonNextFacID, buttonPreviousFacID,
            buttonNextSecID, buttonPreviousDate, buttonNextData, buttonNextNext, buttonNextVerID, buttonPreviousVerID, buttonPreviousFL;
    /*INSTITUTE*********************************************/
    LinearLayout linearLayoutSelectINST, linearLayoutUniINST, LinearLayoutFacINST, LinearLayoutsecINST, linearLayoutDataINST, linearLayoutVerINST, linearLayoutFLINST;

    Button buttonSelectProINST, buttonPreviousproINST, buttonNextFacIDINST, buttonPreviousFacIDINST,
            buttonNextSecIDINST, buttonPreviousDateINST, buttonNextDataINST, buttonNextNextINST, buttonNextVerIDINST, buttonPreviousVerIDINST, buttonPreviousFLINST;

    Button NextE,PreviousE;
    LinearLayout EID;
    boolean Check =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        context = this;

        imageViewEdu = findViewById(R.id.edu);
        linearLayoutEdu = findViewById(R.id.linearedu);
        textViewEdu = findViewById(R.id.edutxt);
        SpinnerEdu = findViewById(R.id.spinneredu);
        SpinnerEllearning = findViewById(R.id.spinner_elearning_id);

        linearLayoutSelect = findViewById(R.id.select_pro_id);
        linearLayoutUni = findViewById(R.id.uni_form_id);
        LinearLayoutFac = findViewById(R.id.fac_form_id);
        LinearLayoutsec = findViewById(R.id.sec_form_id);
        linearLayoutData = findViewById(R.id.data_form_id);
        linearLayoutVer = findViewById(R.id.ver_form_id);
        linearLayoutFL = findViewById(R.id.fl_form_id);

        buttonSelectPro = findViewById(R.id.select_pro_next_id);
        buttonPreviouspro = findViewById(R.id.previous_id);
        buttonNextFacID = findViewById(R.id.next_fac_id);
        buttonNextSecID = findViewById(R.id.next_sec_id);

        buttonPreviousDate = findViewById(R.id.previous_data_id);
        buttonNextData = findViewById(R.id.next_data_id);
        buttonNextNext = findViewById(R.id.next_data_data);

        buttonPreviousFacID = findViewById(R.id.previous_fac_id);
        buttonNextVerID = findViewById(R.id.next_ver_id);
        buttonPreviousVerID = findViewById(R.id.previous_ver_id);
        buttonPreviousFL = findViewById(R.id.previous_fl_id);
        /*/////////////////////////////INSTITUTE*/

        linearLayoutSelectINST = findViewById(R.id.select_pro_id);
        linearLayoutUniINST = findViewById(R.id.uni_form_inst_id);
        LinearLayoutFacINST = findViewById(R.id.fac_form_inst_id);
        LinearLayoutsecINST = findViewById(R.id.sec_form_inst_id);
        linearLayoutDataINST = findViewById(R.id.data_form_inst_id);
        linearLayoutVerINST = findViewById(R.id.ver_form_inst_id);
        linearLayoutFLINST = findViewById(R.id.fl_form_inst_id);

        //buttonSelectProINST = findViewById(R.id.select_pro_next_id);
        buttonPreviousproINST = findViewById(R.id.previous_inst_id);
        buttonNextFacIDINST = findViewById(R.id.next_fac_inst_id);
        buttonNextSecIDINST = findViewById(R.id.next_sec_inst_id);

        buttonPreviousDateINST = findViewById(R.id.previous_data_inst_id);
        buttonNextDataINST = findViewById(R.id.next_data_inst_id);
        buttonNextNextINST = findViewById(R.id.next_data_inst_data);

        buttonPreviousFacIDINST = findViewById(R.id.previous_fac_inst_id);
        buttonNextVerIDINST = findViewById(R.id.next_ver_inst_id);
        buttonPreviousVerIDINST = findViewById(R.id.previous_ver_inst_id);
        buttonPreviousFLINST = findViewById(R.id.previous_fl_inst_id);

        /**///////////////////////
        NextE = findViewById(R.id.next_E_id);
        PreviousE =findViewById(R.id.previous_E_id);
        EID = findViewById(R.id.E_id);

////////////////////////////////////////////////
        Imge = findViewById(R.id.img);

        animShow = AnimationUtils.loadAnimation(context, R.anim.slide_out_left);
        animHide = AnimationUtils.loadAnimation(context, R.anim.slide_in_right);


        animShowre = AnimationUtils.loadAnimation(context, R.anim.slide_in_left);
        animHidere = AnimationUtils.loadAnimation(context, R.anim.slide_out_right);

        SpinnerListEmp = new ArrayList<>();
        SpinnerListEmp.add("University");
        SpinnerListEmp.add("Private institute");
        SpinnerListEmp.add("E_Learning");

        SpinnerListElearnig = new ArrayList<>();
        SpinnerListElearnig.add("University");
        SpinnerListElearnig.add("Private institute");


        linearLayoutEdu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    imageViewEdu.setImageDrawable(ContextCompat.getDrawable(SignUP.this, R.drawable.userblue));
                    textViewEdu.setTextColor(BLUE);
                }
                if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL) {
                    imageViewEdu.setImageDrawable(ContextCompat.getDrawable(SignUP.this, R.drawable.userdarkgray));
                    textViewEdu.setTextColor(BLACK);
                }
                return false;
            }
        });

        adapter = new ArrayAdapter<>(SignUP.this, android.
                R.layout.simple_spinner_dropdown_item, SpinnerListEmp);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerEdu.setPrompt("Select your favorite Planet!");

        SpinnerEdu.setAdapter(
                new NothingSelectedSpinnerAdapter(
                        adapter,
                        R.layout.contact_spinner_row_nothing_selected,
                        // R.layout.contact_spinner_row_nothing_selected, // Optional
                        SignUP.this));


        adapterE = new ArrayAdapter<>(SignUP.this, android.
                R.layout.simple_spinner_dropdown_item, SpinnerListElearnig);
        adapterE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerEllearning.setAdapter(
                new NothingSelectedSpinnerAdapter(
                        adapterE,
                        R.layout.contact_spinner_row_nothing_selected,
                        // R.layout.contact_spinner_row_nothing_selected, // Optional
                        SignUP.this));


        //////////////////////////////////////////////////////

        buttonSelectPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (SpinnerEdu.getSelectedItemPosition() == 1) {
                    Check =true;
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p2));
                    linearLayoutSelect.startAnimation(animShow);
                    linearLayoutSelect.setVisibility(View.GONE);

                    linearLayoutUni.setVisibility(View.VISIBLE);
                    linearLayoutUni.startAnimation(animHide);

                } else if (SpinnerEdu.getSelectedItemPosition() == 2) {
                    Check =true;
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p2));
                    linearLayoutSelectINST.startAnimation(animShow);
                    linearLayoutSelectINST.setVisibility(View.GONE);

                    linearLayoutUniINST.setVisibility(View.VISIBLE);
                    linearLayoutUniINST.startAnimation(animHide);
                } else if (SpinnerEdu.getSelectedItemPosition() == 3) {
                    Check =false;

                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e2));
                    linearLayoutSelect.startAnimation(animShow);
                    linearLayoutSelect.setVisibility(View.GONE);

                    EID.setVisibility(View.VISIBLE);
                    EID.startAnimation(animHide);
                }
            }
        });

        NextE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SpinnerEllearning.getSelectedItemPosition() == 1) {
                    EID.startAnimation(animShow);
                    EID.setVisibility(View.GONE);

                    linearLayoutUni.setVisibility(View.VISIBLE);
                    linearLayoutUni.startAnimation(animHide);
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e3));

                } else if (SpinnerEllearning.getSelectedItemPosition() == 2) {
                    EID.startAnimation(animShow);
                    EID.setVisibility(View.GONE);

                    linearLayoutUniINST.setVisibility(View.VISIBLE);
                    linearLayoutUniINST.startAnimation(animHide);
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e3));
                }
            }
        });
        buttonPreviouspro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p1));
                    linearLayoutUni.setVisibility(View.GONE);
                    linearLayoutUni.startAnimation(animHidere);

                    linearLayoutSelect.startAnimation(animShowre);
                    linearLayoutSelect.setVisibility(View.VISIBLE);
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e2));
                    linearLayoutUni.setVisibility(View.GONE);
                    linearLayoutUni.startAnimation(animHidere);

                    EID.startAnimation(animShowre);
                    EID.setVisibility(View.VISIBLE);
                }

            }
        });

        buttonNextFacID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayoutUni.startAnimation(animShow);
                linearLayoutUni.setVisibility(View.GONE);

                LinearLayoutFac.setVisibility(View.VISIBLE);
                LinearLayoutFac.startAnimation(animHide);

                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p3));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e4));
                }
            }
        });
        buttonPreviousFacID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayoutFac.setVisibility(View.GONE);
                LinearLayoutFac.startAnimation(animHidere);

                linearLayoutUni.startAnimation(animShowre);
                linearLayoutUni.setVisibility(View.VISIBLE);

                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p2));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e3));
                }
            }
        });


        buttonNextSecID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayoutFac.startAnimation(animShow);
                LinearLayoutFac.setVisibility(View.GONE);

                LinearLayoutsec.setVisibility(View.VISIBLE);
                LinearLayoutsec.startAnimation(animHide);

                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p4));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e5));
                }
            }
        });


        buttonNextData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayoutData.startAnimation(animShow);
                linearLayoutData.setVisibility(View.GONE);

                linearLayoutVer.setVisibility(View.VISIBLE);
                linearLayoutVer.startAnimation(animHide);

                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p6));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e7));
                }
            }
        });

        buttonPreviousDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayoutData.setVisibility(View.GONE);
                linearLayoutData.startAnimation(animHidere);

                LinearLayoutsec.startAnimation(animShowre);
                LinearLayoutsec.setVisibility(View.VISIBLE);
                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p4));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e5));
                }
            }
        });

        buttonNextNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayoutsec.startAnimation(animShow);
                LinearLayoutsec.setVisibility(View.GONE);

                linearLayoutData.setVisibility(View.VISIBLE);
                linearLayoutData.startAnimation(animHide);

                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p5));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e6));
                }
            }
        });

        buttonNextVerID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayoutVer.startAnimation(animShow);
                linearLayoutVer.setVisibility(View.GONE);

                linearLayoutFL.setVisibility(View.VISIBLE);
                linearLayoutFL.startAnimation(animHide);

                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p7));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e8));
                }
            }
        });

        buttonPreviousVerID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayoutVer.setVisibility(View.GONE);
                linearLayoutVer.startAnimation(animHidere);

                linearLayoutData.startAnimation(animShowre);
                linearLayoutData.setVisibility(View.VISIBLE);


                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p5));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e6));
                }
            }
        });

        buttonPreviousFL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayoutFL.setVisibility(View.GONE);
                linearLayoutFL.startAnimation(animHidere);

                linearLayoutVer.startAnimation(animShowre);
                linearLayoutVer.setVisibility(View.VISIBLE);


                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p6));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e7));
                }
            }
        });
        /////////////////////////////////////////////////////////////INSTITUTE
    /*    buttonSelectPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayoutSelect.startAnimation(animShow);
                linearLayoutSelect.setVisibility(View.GONE);

                linearLayoutUni.setVisibility(View.VISIBLE);
                linearLayoutUni.startAnimation(animHide);
                Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p2));
            }
        });*/
        buttonPreviousproINST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p1));
                    linearLayoutUniINST.setVisibility(View.GONE);
                    linearLayoutUniINST.startAnimation(animHidere);

                    linearLayoutSelectINST.startAnimation(animShowre);
                    linearLayoutSelectINST.setVisibility(View.VISIBLE);
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e2));

                    linearLayoutUniINST.setVisibility(View.GONE);
                    linearLayoutUniINST.startAnimation(animHidere);

                    EID.startAnimation(animShowre);
                    EID.setVisibility(View.VISIBLE);
                }
            }
        });

        buttonNextFacIDINST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayoutUniINST.startAnimation(animShow);
                linearLayoutUniINST.setVisibility(View.GONE);

                LinearLayoutFacINST.setVisibility(View.VISIBLE);
                LinearLayoutFacINST.startAnimation(animHide);


                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p3));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e4));
                }
            }
        });
        buttonPreviousFacIDINST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e3));
                LinearLayoutFacINST.setVisibility(View.GONE);
                LinearLayoutFacINST.startAnimation(animHidere);

                linearLayoutUniINST.startAnimation(animShowre);
                linearLayoutUniINST.setVisibility(View.VISIBLE);
/*
                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p2));
                    LinearLayoutFacINST.setVisibility(View.GONE);
                    LinearLayoutFacINST.startAnimation(animHidere);

                    linearLayoutUniINST.startAnimation(animShowre);
                    linearLayoutUniINST.setVisibility(View.VISIBLE);

                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e3));
                    LinearLayoutFacINST.setVisibility(View.GONE);
                    LinearLayoutFacINST.startAnimation(animHidere);

                    EID.startAnimation(animShowre);
                    EID.setVisibility(View.VISIBLE);

                }
*/
            }
        });


        buttonNextSecIDINST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayoutFacINST.startAnimation(animShow);
                LinearLayoutFacINST.setVisibility(View.GONE);

                LinearLayoutsec.setVisibility(View.VISIBLE);
                LinearLayoutsec.startAnimation(animHide);

                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p4));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e5));
                }
            }
        });


        buttonNextDataINST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayoutData.startAnimation(animShow);
                linearLayoutData.setVisibility(View.GONE);

                linearLayoutVer.setVisibility(View.VISIBLE);
                linearLayoutVer.startAnimation(animHide);

                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p6));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e7));
                }
            }
        });

        buttonPreviousDateINST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayoutData.setVisibility(View.GONE);
                linearLayoutData.startAnimation(animHidere);

                LinearLayoutsec.startAnimation(animShowre);
                LinearLayoutsec.setVisibility(View.VISIBLE);


                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p4));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e5));
                }
            }
        });

        buttonNextNextINST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayoutsec.startAnimation(animShow);
                LinearLayoutsec.setVisibility(View.GONE);

                linearLayoutData.setVisibility(View.VISIBLE);
                linearLayoutData.startAnimation(animHide);
                Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p5));

                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p5));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e6));
                }
            }
        });

        buttonNextVerIDINST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayoutVer.startAnimation(animShow);
                linearLayoutVer.setVisibility(View.GONE);

                linearLayoutFL.setVisibility(View.VISIBLE);
                linearLayoutFL.startAnimation(animHide);


                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p7));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e8));
                }
            }
        });

        buttonPreviousVerIDINST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayoutVer.setVisibility(View.GONE);
                linearLayoutVer.startAnimation(animHidere);

                linearLayoutData.startAnimation(animShowre);
                linearLayoutData.setVisibility(View.VISIBLE);

                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p5));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e6));
                }
            }
        });

        buttonPreviousFLINST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayoutFL.setVisibility(View.GONE);
                linearLayoutFL.startAnimation(animHidere);

                linearLayoutVer.startAnimation(animShowre);
                linearLayoutVer.setVisibility(View.VISIBLE);
                Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p6));

                if (Check){
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p6));
                }else{
                    Imge.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.e7));
                }
            }
        });

        PreviousE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EID.setVisibility(View.GONE);
                EID.startAnimation(animHidere);

                linearLayoutSelect.startAnimation(animShowre);
                linearLayoutSelect.setVisibility(View.VISIBLE);
                Imge.setImageDrawable(ContextCompat.getDrawable(context, R.mipmap.p1));
            }
        });
    }
}
