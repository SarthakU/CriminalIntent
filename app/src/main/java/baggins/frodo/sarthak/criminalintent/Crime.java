package baggins.frodo.sarthak.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime
{
    private UUID mId;
    private String mTitle;
    private boolean mSolved;
    private Date mDate;

    public Crime()
    {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId()
    {
        return mId;
    }

    public void setTitle(String Title)
    {
        this.mTitle = mTitle;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public boolean isSolved()
    {
        return mSolved;
    }

    public void setSolved(boolean Solved)
    {
        this.mSolved = Solved;
    }

    public void setmDate(Date date)
    {
        this.mDate = date;
    }

    public Date getDate()
    {
        return mDate;
    }
}
