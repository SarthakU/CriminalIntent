package baggins.frodo.sarthak.criminalintent;

import java.util.UUID;

public class Crime
{
    private UUID mId;
    private String mTitle;

    public Crime()
    {
        mId = UUID.randomUUID();
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
}
